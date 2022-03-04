package message;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class MessageRepository {


    private JdbcTemplate jdbcTemplate;

    public MessageRepository(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void insertMessage(long senderId, long receiverId, String message) {
        jdbcTemplate.update("insert into messages(sender_id,receiver_id,message) values(?,?,?)", senderId,receiverId,message);
    }

    public List<String> findMessagesBySenderId(long senderId){
        return jdbcTemplate.query("select message from messages where sender_id=?",
                (rs, rowNum) -> rs.getString("message"),
                senderId);
    }





}
