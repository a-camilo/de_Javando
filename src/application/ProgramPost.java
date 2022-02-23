package application;

import entities.Comments;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ProgramPost {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comments c1 = new Comments("Have a nice trip!");

        Comments c2 = new Comments("Wow that's awesome!");

        Post p1 = new Post(sdf.parse(
                "22/02/2022 15:40:05"),
                "Travelling to New Zealand",
                "I'm going to visit this wonderful country",
                23);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

    }


}
