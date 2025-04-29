import br.edu.ifrs.riogrande.tads.ppa.Model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

package br.edu.ifrs.riogrande.tads.ppa.service;


public class UserService {

    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }

    public Optional<User> findUserById(int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst();
    }


    public boolean updateUser(int id, User updatedUser) {
        Optional<User> userOptional = findUserById(id);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setName(updatedUser.getName());
            user.setEmail(updatedUser.getEmail());
            return true;
        }
        return false;
    }

    public boolean deleteUser(int id) {
        return users.removeIf(user -> user.getId() == id);
    }
}