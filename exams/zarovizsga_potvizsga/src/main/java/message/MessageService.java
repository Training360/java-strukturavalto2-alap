package message;

import java.util.Optional;

public class MessageService {

    private UserRepository userRepository;
    private MessageRepository messageRepository;

    public MessageService(UserRepository userRepository, MessageRepository messageRepository) {
        this.userRepository = userRepository;
        this.messageRepository = messageRepository;
    }


    public void registerUser(String username) {
        Optional<User> isTaken = userRepository.findUserByName(username);
        if (!isTaken.isEmpty()) {
            throw new IllegalArgumentException("Username is already taken: " + username);

        }
        userRepository.insertUser(username);
    }

    public void sendMessage(User sender, User receiver, String message) {
        Optional<User> actualSender = userRepository.findUserByName(sender.getUsername());
        Optional<User> actualReceiver = userRepository.findUserByName(receiver.getUsername());

        if (actualReceiver.isPresent() && actualSender.isPresent()) {
            messageRepository.insertMessage(actualSender.get().getId(), actualReceiver.get().getId(), message);
        } else {
            throw new IllegalArgumentException("Sender or receiver not found!");
        }
    }
}
