package com.company;

public class Cake {

    private final double OPRINDELIGT_ANTAL_PERSONER;
    private int ønskedeServeringer;
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


    public Cake() {
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

    }




    public double getIngrediensTotalVægt() {
        ingrediensTotalVægt = ((gramDigistivekiks * étGramDigistivekiks) + (gramSmør * étGramSmør) + (teskefuldStødtKanel * énTeskefuldStødtKanel)
        + (bladeHusblas * étBladHusblas) + (gramFlødeostNeutral * étGramFlødeostNeutral) + (gramFlormelis * étGramFlormelis) + (antalLime * énLimeVægt)
         + (deciliterPiskefløde * énDeciliterPiskfløde) + (gramHindbær * étGramHindbær) + (gramRibsgelé * étGramRibsgelé));
        return ingrediensTotalVægt;
    }

    public double getBagtVægt(){
        bagtVægt = ingrediensTotalVægt * bagtVægtRatio;
        return bagtVægt;
    }

    public String toString(){
        return "Cheesecake til 12 personer " +
                "\n Den samlede vægt for ingredienserne " + getIngrediensTotalVægt() + " gram." +
                "\n Den samlede vægt for kagen samlet(bagt) " + getBagtVægt() + " gram.";
    }

}
