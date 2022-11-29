package com.example.demo;

import com.example.demo.observer.CharacterImpl;
import com.example.demo.observer.Observer;
import com.example.demo.subject.Server;
import com.example.demo.subject.Subject;

public class App {
    public static void main(String[] args) throws Exception {

        Subject game = new Server();

        Observer jinX = new CharacterImpl("JinX");
        Observer garen = new CharacterImpl("Garen");
        Observer yasuo = new CharacterImpl("Yasuo");

        jinX.join(game);
        garen.join(game);
        yasuo.join(game);

        game.notifyAll("start game");

        System.out.println("Playing.................\n\n");

        jinX.ping(game, ((CharacterImpl) jinX).getName() + ":::::PING:::::TOP");
    }
}
