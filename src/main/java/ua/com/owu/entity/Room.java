package ua.com.owu.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int nRoom;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<User> users = new ArrayList<>();

    public Room() {
    }

    public Room(int nRoom) {
        this.nRoom = nRoom;
    }

    public Room(int nRoom, List<User> users) {
        this.nRoom = nRoom;
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getnRoom() {
        return nRoom;
    }

    public void setnRoom(int nRoom) {
        this.nRoom = nRoom;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", nRoom=" + nRoom +
                '}';
    }
}
