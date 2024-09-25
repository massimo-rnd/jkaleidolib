package gg.druffko.jkaleidolib.test;

import gg.druffko.jkaleidolib.lib.Background;
import gg.druffko.jkaleidolib.lib.Color;
import gg.druffko.jkaleidolib.lib.Formatting;
import gg.druffko.jkaleidolib.lib.Lining;

public class ColorizeDemo {

    public static void main(String[]args){
        System.out.println("Welcome to " + Color.blue("K") + Color.cyan("A") + Color.red("L") + Color.green("E") + Color.purple("I") + Color.white("D") + Color.yellow("O") + "LIB");
        color();
        background();
        formatting();
        lining();
        combined();
    }

    static void color() {
        System.out.println("You can have colors!\n");
        System.out.println(Color.black("Hello!"));
        System.out.println(Color.red("Hallo!"));
        System.out.println(Color.green("Bonjour!"));
        System.out.println(Color.yellow("Hola!"));
        System.out.println(Color.blue("Ciao!"));
        System.out.println(Color.purple("Olà!"));
        System.out.println(Color.cyan("Namaste!"));
        System.out.println(Color.white("Salaam!"));
        System.out.println("\n-------------------------\n");
    }

    static void background() {
        System.out.println("You can have backgrounds!\n");
        System.out.println(Background.black("Merhaba!"));
        System.out.println(Background.red("Sain bainuu!"));
        System.out.println(Background.green("Nay Hoh!"));
        System.out.println(Background.yellow("Szia!"));
        System.out.println(Background.blue("Marhaba!"));
        System.out.println(Background.purple("Sannu!"));
        System.out.println(Background.cyan("Jambo!"));
        System.out.println(Background.white("Ni Hau!"));
        System.out.println("\n-------------------------\n");
    }

    static void formatting() {
        System.out.println("You can have formattings!\n");
        System.out.println(Formatting.bold("Halo!"));
        System.out.println(Formatting.italic("Oi!"));
        System.out.println(Formatting.dim("Zdravstvujte!"));
        System.out.println(Formatting.slowblink("Sà-wàt-dee!"));
        System.out.println(Formatting.rapidblink("Sà-wàt-dee!"));
        System.out.println(Formatting.reverse("Cześć!"));
        System.out.println(Formatting.invisible("Akkam!"));
        System.out.println("\n-------------------------\n");
    }

    static void lining() {
        System.out.println("You can have \"linings\"!\n");
        System.out.println(Lining.underline("Silaw!"));
        System.out.println(Lining.thickunderline("Salut!"));
        System.out.println(Lining.italicunderline("Musta!"));
        System.out.println(Lining.strikethrough("Salam!"));
        System.out.println(Lining.overline("Pranam!"));
        System.out.println("\n-------------------------\n");
    }

    static void combined() {
        System.out.println("You can also combine them!\n");
        System.out.println(Background.green(Lining.underline(Color.blue("Ndêwó!"))));
        System.out.println(Color.yellow(Background.white("Mbote!")));
        System.out.println(Lining.strikethrough(Color.purple("Yassou!")));
        System.out.println(Lining.strikethrough(Lining.underline("God dag!")));
    }
}
