package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    /*    Scanner sc = new Scanner(System.in);
        final double OPRINDELIGT_ANTAL_PERSONER = 12;
        int ønskedeAntalPersoner;

        DecimalFormat df = new DecimalFormat("#.#");


        // Bruger får præsenteret ingredienser til kagen
        System.out.println("Velkommen til opskriften for Hindbær Cheesecake");
        System.out.println("\n");
        // Opskriften udskrives

        //Kiksebund
        int gramDigistivekiks = 250;
        int gramSmør = 150;
        int teskefuldStødtKanel = 1;

        // Flødeostecreme
        double bladeHusblas = 3;
        int gramFlødeostNeutral = 400;
        int gramFlormelis = 100;
        int antalLime = 1;
        double deciliterPiskefløde = 2.5;

        // Pynt
        int gramHindbær = 400;
        int gramRibsgelé = 200;


        //System.out.println("Kiksebund - Opskrift");
        //System.out.println(gramDigistivekiks + "g  Digistive kiks");
        //System.out.println(gramSmør + "g  Smør");
        //System.out.println(teskefuldStødtKanel + "tsk  Stødt kanel");
        //System.out.println("\n");
        //System.out.println("Flødeostecreme - Opskrift");
        //System.out.println(bladeHusblas + "   Blade Husblas");
        //System.out.println(gramFlødeostNeutral + "g  Flødeost Neutral");
        //System.out.println(gramFlormelis + "g  Flormelis");
        //System.out.println(antalLime + "stk  Lime");
        //System.out.println(deciliterPiskefløde + "dl Piskefløde");
        //System.out.println("\n");
        //System.out.println("Pynt - Opskrift");
        //System.out.println(gramHindbær + "g Hindbær");
        //System.out.println(gramRibsgelé + "g Ribsgele");
        //System.out.println("\n");


        // Hvor mange personer skal kagen bruges til?
        System.out.println("Hvor mange personer skal du lave kagen til?");
        ønskedeAntalPersoner = sc.nextInt();

        // Omregningsfaktor
        double omregningsfaktor = ((ønskedeAntalPersoner / OPRINDELIGT_ANTAL_PERSONER));

        // TODO  - Lav en if sætning - Default x person - skal du bruge den til færre eller flere? Hvis ja spørg hvor mange
        // TODO - if sætning med beregningen

        System.out.println("\n");

        System.out.println("Du skal bruge følgende indgredienser til " + ønskedeAntalPersoner + " person(er):");
        System.out.println("\n");

        // TODO - Adskil beregninger og print.

        double nyGramDigistivekiks = (double) gramDigistivekiks * omregningsfaktor;
        double nyGramSmør = (double) gramSmør * omregningsfaktor;
        double nyTeskefuldeStødtKanel = (double) teskefuldStødtKanel * omregningsfaktor;

        System.out.println("Kiksebund - Opskrift");
        System.out.println((df.format(nyGramDigistivekiks)) + "g   Digistive kiks");
        System.out.println((df.format(nyGramSmør)) + "g    Smør");
        System.out.println((df.format(nyTeskefuldeStødtKanel)) + "tsk  Stødt kanel");
        System.out.println("\n");

        double nyBladeHusblas = (double) bladeHusblas * omregningsfaktor;
        double nyFlødeostNeutral = (double) gramFlødeostNeutral * omregningsfaktor;
        double nyGramFlormelis = (double) gramFlormelis * omregningsfaktor;
        double nyAntalLime = (double) antalLime * omregningsfaktor;
        double nyDeciliterPiskefløde = (double) deciliterPiskefløde * omregningsfaktor;


        System.out.println("Flødeostecreme - Opskrift");
        System.out.println((df.format(nyBladeHusblas)) + "   Blade Husblas");
        System.out.println((df.format(nyFlødeostNeutral)) + "g Flødeost Neutral");
        System.out.println((df.format(nyGramFlormelis)) + "g  Flormelis");
        System.out.println((df.format(nyAntalLime)) + "stk Lime");
        System.out.println((df.format(nyDeciliterPiskefløde)) + "dl Piskefløde");

        System.out.println("\n");

        double nyGramHindbær = (double) gramHindbær * omregningsfaktor;
        double nyGramRibsgelé = (double) gramRibsgelé * omregningsfaktor;

        System.out.println("Pynt - Opskrift");
        System.out.println((df.format(nyGramHindbær)) + "g Hindbær");
        System.out.println((df.format(nyGramRibsgelé)) + "g Ribsgele");
        System.out.println("\n");

        // Vægt for én enhed af hver ingrediens
        int étGramDigistivekiks = 1;
        int étGramSmør = 1;
        double énTeskefuldStødtKanel = 2.5;
        int étBladHusblas = 2;
        int étGramFlødeostNeutral = 1;
        int étGramFlormelis = 1;
        double énLimeVægt = 55;
        double énDeciliterPiskfløde = 95;
        int étGramHindbær = 1;
        int étGramRibsgelé = 1;

        // Variabler for samlede vægt for hver ingrediens
        double vægtDigistivekiks = étGramDigistivekiks * nyGramDigistivekiks;
        double vægtSmør = étGramSmør * nyGramSmør;
        double vægtTeskeFuldStødtKanel = énTeskefuldStødtKanel * nyTeskefuldeStødtKanel;
        double vægtHusblas = étBladHusblas * nyBladeHusblas;
        double vægtFlødeostNeutral = étGramFlødeostNeutral * nyFlødeostNeutral;
        double vægtFlormelis = étGramFlormelis * nyGramFlormelis;
        double vægtLime = énLimeVægt * nyAntalLime;
        double vægtPiskefløde = énDeciliterPiskfløde * nyDeciliterPiskefløde;
        double vægtHindbær = étGramHindbær * nyGramHindbær;
        double vægtRibsgelé = étGramRibsgelé * nyGramRibsgelé;

        // Den samlede vægt for alle ingredienserne der skal bruges til kagen
        double samletIngrediensVægt = (vægtDigistivekiks + vægtSmør + vægtTeskeFuldStødtKanel + vægtHusblas
                + vægtFlødeostNeutral + vægtFlormelis + vægtLime + vægtPiskefløde + vægtHindbær + vægtRibsgelé);
        System.out.print("Den samlede vægt for kagens ingredienser til " + ønskedeAntalPersoner + " person(er) ");
        System.out.println("er følgende:  " + (df.format(samletIngrediensVægt)) + "g");

        //total kagevægt forventet 10% lavere end ingrediens vægt.
        double totalKagevægt = samletIngrediensVægt * 0.9;
        System.out.print("Vægten for den færdige kage for " + ønskedeAntalPersoner + " person(er) forventes at være ca: ");
        System.out.println((df.format(totalKagevægt)) + "g"); */

        Cake cake = new Cake();
        System.out.println(cake.getIngrediensTotalVægt());
        System.out.println(cake.getBagtVægt());

        System.out.println(cake);



    }
}
