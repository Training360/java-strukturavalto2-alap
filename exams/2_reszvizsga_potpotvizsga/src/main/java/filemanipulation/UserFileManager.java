package filemanipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserFileManager {

    private List<User> users = new ArrayList<>();


    public void readUsersFromFile(Path path) {

        try {
            List<String> userFileLines = Files.readAllLines(path);
            users.addAll(creatUsersFromLines(userFileLines));
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!",e);
        }
    }

    private List<User> creatUsersFromLines(List<String> userFileLines) {
        List<User> result = new ArrayList<>();

        for(String line : userFileLines){
            String[] tmp = line.split(" ");
            result.add(new User(tmp[0], Integer.parseInt(tmp[1]),tmp[2]));
        }

        return result;
    }

    public void writeMaleHumansToFile(Path path){
        List<String> searchedUsers = collectSearchedUsers();
        try {
            Files.write(path,searchedUsers);
        } catch (IOException e) {
            throw new IllegalStateException("Can't write file!",e);
        }
    }

    private List<String> collectSearchedUsers() {
        List<String> result = new ArrayList<>();
        for(User actual : users){
            if(actual.isEmailAndUserMatches()){
                result.add(actual.getUserName());
            }
        }
        return result;
    }


    public List<User> getUsers() {
        return users;
    }
}
