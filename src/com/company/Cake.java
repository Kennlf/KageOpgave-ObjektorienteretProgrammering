package com.company;

import java.text.DecimalFormat;

public class Cake {

    DecimalFormat df = new DecimalFormat("#.#");
    private double OPRINDELIGT_ANTAL_PERSONER;
    private double ønskedeServeringer;
    private double omregningsfaktor;
    private double bagtVægtRatio;
    private double bagtVægt;
    private double ingrediensTotalVægt;

    // Ingredienser til 12 personer
    //Kiksebund
    private int gramDigistivekiks;
    private int gramSmør;
    private int teskefuldStødtKanel;
    // Flødeostecreme
    private double bladeHusblas;
    private int gramFlødeostNeutral;
    private int gramFlormelis;
    private int antalLime;
    private double deciliterPiskefløde;
    // Pynt
    private int gramHindbær;
    private int gramRibsgelé;
    // vægt for 1 enhed af hver ingrediens
    private int étGramDigistivekiks;
    private int étGramSmør;
    private double énTeskefuldStødtKanel;
    private int étBladHusblas;
    private int étGramFlødeostNeutral;
    private int étGramFlormelis;
    private double énLimeVægt;
    private double énDeciliterPiskfløde;
    private int étGramHindbær;
    private int étGramRibsgelé;

    private double nyGramDigistivekiks = (double) gramDigistivekiks * omregningsfaktor;
    private double nyGramSmør = (double) gramSmør * omregningsfaktor;
    private double nyTeskefuldeStødtKanel = (double) teskefuldStødtKanel * omregningsfaktor;
    private double nyBladeHusblas = (double) bladeHusblas * omregningsfaktor;
    private double nyFlødeostNeutral = (double) gramFlødeostNeutral * omregningsfaktor;
    private double nyGramFlormelis = (double) gramFlormelis * omregningsfaktor;
    private double nyAntalLime = (double) antalLime * omregningsfaktor;
    private double nyDeciliterPiskefløde = (double) deciliterPiskefløde * omregningsfaktor;
    private double nyGramHindbær = (double) gramHindbær * omregningsfaktor;
    private double nyGramRibsgelé = (double) gramRibsgelé * omregningsfaktor;


    public Cake() {
        this.OPRINDELIGT_ANTAL_PERSONER = 12;
        this.ønskedeServeringer = OPRINDELIGT_ANTAL_PERSONER;
        this.omregningsfaktor = 1;
        this.bagtVægtRatio = 0.9;
        this.bagtVægt = bagtVægt;
        this.ingrediensTotalVægt = ingrediensTotalVægt;

        // ingredienser for 12 personer
        //Kiksebund
        this.gramDigistivekiks = 250;
        this.gramSmør = 150;
        this.teskefuldStødtKanel = 1;
        // Flødeostecreme
        this.bladeHusblas = 3;
        this.gramFlødeostNeutral = 400;
        this.gramFlormelis = 100;
        this.antalLime = 1;
        this.deciliterPiskefløde = 2.5;
        // Pynt
        this.gramHindbær = 400;
        this.gramRibsgelé = 200;

        // vægt for 1 enhed af hver ingrediens
        this.étGramDigistivekiks = 1;
        this.étGramSmør = 1;
        this.énTeskefuldStødtKanel = 2.5;
        this.étBladHusblas = 2;
        this.étGramFlødeostNeutral = 1;
        this.étGramFlormelis = 1;
        this.énLimeVægt = 55;
        this.énDeciliterPiskfløde = 95;
        this.étGramHindbær = 1;
        this.étGramRibsgelé = 1;

        this.nyGramDigistivekiks = (double) gramDigistivekiks * omregningsfaktor;
        this.nyGramSmør = (double) gramSmør * omregningsfaktor;
        this.nyTeskefuldeStødtKanel = (double) teskefuldStødtKanel * omregningsfaktor;
        this.nyBladeHusblas = (double) bladeHusblas * omregningsfaktor;
        this.nyFlødeostNeutral = (double) gramFlødeostNeutral * omregningsfaktor;
        this.nyGramFlormelis = (double) gramFlormelis * omregningsfaktor;
        this.nyAntalLime = (double) antalLime * omregningsfaktor;
        this.nyDeciliterPiskefløde = (double) deciliterPiskefløde * omregningsfaktor;
        this.nyGramHindbær = (double) gramHindbær * omregningsfaktor;
        this.nyGramRibsgelé = (double) gramRibsgelé * omregningsfaktor;
    }

    public Cake(int ønskedeServeringer) {
        this.OPRINDELIGT_ANTAL_PERSONER = 12;
        this.ønskedeServeringer = ønskedeServeringer;
        this.omregningsfaktor = ((ønskedeServeringer / OPRINDELIGT_ANTAL_PERSONER));
        this.bagtVægtRatio = 0.9;
        this.bagtVægt = bagtVægt;
        this.ingrediensTotalVægt = ingrediensTotalVægt;

        // ingredienser for 12 personer
        //Kiksebund
        this.gramDigistivekiks = 250;
        this.gramSmør = 150;
        this.teskefuldStødtKanel = 1;
        // Flødeostecreme
        this.bladeHusblas = 3;
        this.gramFlødeostNeutral = 400;
        this.gramFlormelis = 100;
        this.antalLime = 1;
        this.deciliterPiskefløde = 2.5;
        // Pynt
        this.gramHindbær = 400;
        this.gramRibsgelé = 200;

    }


    public double getIngrediensTotalVægt() {
        ingrediensTotalVægt = ((gramDigistivekiks * étGramDigistivekiks) + (gramSmør * étGramSmør) + (teskefuldStødtKanel * énTeskefuldStødtKanel)
                + (bladeHusblas * étBladHusblas) + (gramFlødeostNeutral * étGramFlødeostNeutral) + (gramFlormelis * étGramFlormelis) + (antalLime * énLimeVægt)
                + (deciliterPiskefløde * énDeciliterPiskfløde) + (gramHindbær * étGramHindbær) + (gramRibsgelé * étGramRibsgelé));
        return ingrediensTotalVægt;
    }

    public double getBagtVægt() {
        bagtVægt = ingrediensTotalVægt * bagtVægtRatio;
        return bagtVægt;
    }


    public String toString() {
        return "\n Cheesecake til " + ønskedeServeringer + " personer" +
                "\n Så skal du bruge følgende ingredienser" +
                "\n Digistivekiks: " + df.format((gramDigistivekiks * omregningsfaktor)) + " gram" +
                "\n Smør: " + df.format((gramSmør * omregningsfaktor)) + " gram" +
                "\n Stødt kanel: " + df.format((teskefuldStødtKanel * omregningsfaktor)) + " teskefulde" +
                "\n Husblas: " + df.format((bladeHusblas * omregningsfaktor)) + " blade" +
                "\n Flødeost Neutral: " + df.format(gramFlødeostNeutral * omregningsfaktor) + "gram" +
                "\n Flormelis: " + df.format((gramFlormelis * omregningsfaktor)) + " gram" +
                "\n Lime: " + df.format((antalLime * omregningsfaktor)) + " stk." +
                "\n Piskefløde: " + df.format((deciliterPiskefløde * omregningsfaktor)) + " dl" +
                "\n Hindbær: " + df.format((gramHindbær * omregningsfaktor)) + " gram" +
                "\n Ribsgelé: " + df.format((gramRibsgelé * omregningsfaktor)) + " gram";


    }

}
