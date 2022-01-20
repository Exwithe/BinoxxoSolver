package com.company.binoxxosolver;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Controller {
    //Variables
    private boolean notSolved = true;

    //GUI Items
    @FXML
    private Button buttonSolve;
    @FXML
    private Button buttonReset;
    @FXML
    private Button buttonStepbystep;
    @FXML
    private Label errors;

    //Grid
    @FXML private Button button00;@FXML private Button button01;@FXML private Button button02;@FXML private Button button03;@FXML private Button button04;@FXML private Button button05;@FXML private Button button06;@FXML private Button button07;@FXML private Button button08;@FXML private Button button09;
    @FXML private Button button10;@FXML private Button button11;@FXML private Button button12;@FXML private Button button13;@FXML private Button button14;@FXML private Button button15;@FXML private Button button16;@FXML private Button button17;@FXML private Button button18;@FXML private Button button19;
    @FXML private Button button20;@FXML private Button button21;@FXML private Button button22;@FXML private Button button23;@FXML private Button button24;@FXML private Button button25;@FXML private Button button26;@FXML private Button button27;@FXML private Button button28;@FXML private Button button29;
    @FXML private Button button30;@FXML private Button button31;@FXML private Button button32;@FXML private Button button33;@FXML private Button button34;@FXML private Button button35;@FXML private Button button36;@FXML private Button button37;@FXML private Button button38;@FXML private Button button39;
    @FXML private Button button40;@FXML private Button button41;@FXML private Button button42;@FXML private Button button43;@FXML private Button button44;@FXML private Button button45;@FXML private Button button46;@FXML private Button button47;@FXML private Button button48;@FXML private Button button49;
    @FXML private Button button50;@FXML private Button button51;@FXML private Button button52;@FXML private Button button53;@FXML private Button button54;@FXML private Button button55;@FXML private Button button56;@FXML private Button button57;@FXML private Button button58;@FXML private Button button59;
    @FXML private Button button60;@FXML private Button button61;@FXML private Button button62;@FXML private Button button63;@FXML private Button button64;@FXML private Button button65;@FXML private Button button66;@FXML private Button button67;@FXML private Button button68;@FXML private Button button69;
    @FXML private Button button70;@FXML private Button button71;@FXML private Button button72;@FXML private Button button73;@FXML private Button button74;@FXML private Button button75;@FXML private Button button76;@FXML private Button button77;@FXML private Button button78;@FXML private Button button79;
    @FXML private Button button80;@FXML private Button button81;@FXML private Button button82;@FXML private Button button83;@FXML private Button button84;@FXML private Button button85;@FXML private Button button86;@FXML private Button button87;@FXML private Button button88;@FXML private Button button89;
    @FXML private Button button90;@FXML private Button button91;@FXML private Button button92;@FXML private Button button93;@FXML private Button button94;@FXML private Button button95;@FXML private Button button96;@FXML private Button button97;@FXML private Button button98;@FXML private Button button99;

//events
//Switch X,O and <empty>
@FXML void next00(MouseEvent event) {if(notSolved){switch (button00.getText()) {case "X":button00.setText("O");break; case "O":button00.setText(" ");break; default:button00.setText("X");}}}
    @FXML void next01(MouseEvent event) {if(notSolved){switch (button01.getText()) {case "X":button01.setText("O");break; case "O":button01.setText(" ");break; default:button01.setText("X");}}}
    @FXML void next02(MouseEvent event) {if(notSolved){switch (button02.getText()) {case "X":button02.setText("O");break; case "O":button02.setText(" ");break; default:button02.setText("X");}}}
    @FXML void next03(MouseEvent event) {if(notSolved){switch (button03.getText()) {case "X":button03.setText("O");break; case "O":button03.setText(" ");break; default:button03.setText("X");}}}
    @FXML void next04(MouseEvent event) {if(notSolved){switch (button04.getText()) {case "X":button04.setText("O");break; case "O":button04.setText(" ");break; default:button04.setText("X");}}}
    @FXML void next05(MouseEvent event) {if(notSolved){switch (button05.getText()) {case "X":button05.setText("O");break; case "O":button05.setText(" ");break; default:button05.setText("X");}}}
    @FXML void next06(MouseEvent event) {if(notSolved){switch (button06.getText()) {case "X":button06.setText("O");break; case "O":button06.setText(" ");break; default:button06.setText("X");}}}
    @FXML void next07(MouseEvent event) {if(notSolved){switch (button07.getText()) {case "X":button07.setText("O");break; case "O":button07.setText(" ");break; default:button07.setText("X");}}}
    @FXML void next08(MouseEvent event) {if(notSolved){switch (button08.getText()) {case "X":button08.setText("O");break; case "O":button08.setText(" ");break; default:button08.setText("X");}}}
    @FXML void next09(MouseEvent event) {if(notSolved){switch (button09.getText()) {case "X":button09.setText("O");break; case "O":button09.setText(" ");break; default:button09.setText("X");}}}
    @FXML void next10(MouseEvent event) {if(notSolved){switch (button10.getText()) {case "X":button10.setText("O");break; case "O":button10.setText(" ");break; default:button10.setText("X");}}}
    @FXML void next11(MouseEvent event) {if(notSolved){switch (button11.getText()) {case "X":button11.setText("O");break; case "O":button11.setText(" ");break; default:button11.setText("X");}}}
    @FXML void next12(MouseEvent event) {if(notSolved){switch (button12.getText()) {case "X":button12.setText("O");break; case "O":button12.setText(" ");break; default:button12.setText("X");}}}
    @FXML void next13(MouseEvent event) {if(notSolved){switch (button13.getText()) {case "X":button13.setText("O");break; case "O":button13.setText(" ");break; default:button13.setText("X");}}}
    @FXML void next14(MouseEvent event) {if(notSolved){switch (button14.getText()) {case "X":button14.setText("O");break; case "O":button14.setText(" ");break; default:button14.setText("X");}}}
    @FXML void next15(MouseEvent event) {if(notSolved){switch (button15.getText()) {case "X":button15.setText("O");break; case "O":button15.setText(" ");break; default:button15.setText("X");}}}
    @FXML void next16(MouseEvent event) {if(notSolved){switch (button16.getText()) {case "X":button16.setText("O");break; case "O":button16.setText(" ");break; default:button16.setText("X");}}}
    @FXML void next17(MouseEvent event) {if(notSolved){switch (button17.getText()) {case "X":button17.setText("O");break; case "O":button17.setText(" ");break; default:button17.setText("X");}}}
    @FXML void next18(MouseEvent event) {if(notSolved){switch (button18.getText()) {case "X":button18.setText("O");break; case "O":button18.setText(" ");break; default:button18.setText("X");}}}
    @FXML void next19(MouseEvent event) {if(notSolved){switch (button19.getText()) {case "X":button19.setText("O");break; case "O":button19.setText(" ");break; default:button19.setText("X");}}}
    @FXML void next20(MouseEvent event) {if(notSolved){switch (button20.getText()) {case "X":button20.setText("O");break; case "O":button20.setText(" ");break; default:button20.setText("X");}}}
    @FXML void next21(MouseEvent event) {if(notSolved){switch (button21.getText()) {case "X":button21.setText("O");break; case "O":button21.setText(" ");break; default:button21.setText("X");}}}
    @FXML void next22(MouseEvent event) {if(notSolved){switch (button22.getText()) {case "X":button22.setText("O");break; case "O":button22.setText(" ");break; default:button22.setText("X");}}}
    @FXML void next23(MouseEvent event) {if(notSolved){switch (button23.getText()) {case "X":button23.setText("O");break; case "O":button23.setText(" ");break; default:button23.setText("X");}}}
    @FXML void next24(MouseEvent event) {if(notSolved){switch (button24.getText()) {case "X":button24.setText("O");break; case "O":button24.setText(" ");break; default:button24.setText("X");}}}
    @FXML void next25(MouseEvent event) {if(notSolved){switch (button25.getText()) {case "X":button25.setText("O");break; case "O":button25.setText(" ");break; default:button25.setText("X");}}}
    @FXML void next26(MouseEvent event) {if(notSolved){switch (button26.getText()) {case "X":button26.setText("O");break; case "O":button26.setText(" ");break; default:button26.setText("X");}}}
    @FXML void next27(MouseEvent event) {if(notSolved){switch (button27.getText()) {case "X":button27.setText("O");break; case "O":button27.setText(" ");break; default:button27.setText("X");}}}
    @FXML void next28(MouseEvent event) {if(notSolved){switch (button28.getText()) {case "X":button28.setText("O");break; case "O":button28.setText(" ");break; default:button28.setText("X");}}}
    @FXML void next29(MouseEvent event) {if(notSolved){switch (button29.getText()) {case "X":button29.setText("O");break; case "O":button29.setText(" ");break; default:button29.setText("X");}}}
    @FXML void next30(MouseEvent event) {if(notSolved){switch (button30.getText()) {case "X":button30.setText("O");break; case "O":button30.setText(" ");break; default:button30.setText("X");}}}
    @FXML void next31(MouseEvent event) {if(notSolved){switch (button31.getText()) {case "X":button31.setText("O");break; case "O":button31.setText(" ");break; default:button31.setText("X");}}}
    @FXML void next32(MouseEvent event) {if(notSolved){switch (button32.getText()) {case "X":button32.setText("O");break; case "O":button32.setText(" ");break; default:button32.setText("X");}}}
    @FXML void next33(MouseEvent event) {if(notSolved){switch (button33.getText()) {case "X":button33.setText("O");break; case "O":button33.setText(" ");break; default:button33.setText("X");}}}
    @FXML void next34(MouseEvent event) {if(notSolved){switch (button34.getText()) {case "X":button34.setText("O");break; case "O":button34.setText(" ");break; default:button34.setText("X");}}}
    @FXML void next35(MouseEvent event) {if(notSolved){switch (button35.getText()) {case "X":button35.setText("O");break; case "O":button35.setText(" ");break; default:button35.setText("X");}}}
    @FXML void next36(MouseEvent event) {if(notSolved){switch (button36.getText()) {case "X":button36.setText("O");break; case "O":button36.setText(" ");break; default:button36.setText("X");}}}
    @FXML void next37(MouseEvent event) {if(notSolved){switch (button37.getText()) {case "X":button37.setText("O");break; case "O":button37.setText(" ");break; default:button37.setText("X");}}}
    @FXML void next38(MouseEvent event) {if(notSolved){switch (button38.getText()) {case "X":button38.setText("O");break; case "O":button38.setText(" ");break; default:button38.setText("X");}}}
    @FXML void next39(MouseEvent event) {if(notSolved){switch (button39.getText()) {case "X":button39.setText("O");break; case "O":button39.setText(" ");break; default:button39.setText("X");}}}
    @FXML void next40(MouseEvent event) {if(notSolved){switch (button40.getText()) {case "X":button40.setText("O");break; case "O":button40.setText(" ");break; default:button40.setText("X");}}}
    @FXML void next41(MouseEvent event) {if(notSolved){switch (button41.getText()) {case "X":button41.setText("O");break; case "O":button41.setText(" ");break; default:button41.setText("X");}}}
    @FXML void next42(MouseEvent event) {if(notSolved){switch (button42.getText()) {case "X":button42.setText("O");break; case "O":button42.setText(" ");break; default:button42.setText("X");}}}
    @FXML void next43(MouseEvent event) {if(notSolved){switch (button43.getText()) {case "X":button43.setText("O");break; case "O":button43.setText(" ");break; default:button43.setText("X");}}}
    @FXML void next44(MouseEvent event) {if(notSolved){switch (button44.getText()) {case "X":button44.setText("O");break; case "O":button44.setText(" ");break; default:button44.setText("X");}}}
    @FXML void next45(MouseEvent event) {if(notSolved){switch (button45.getText()) {case "X":button45.setText("O");break; case "O":button45.setText(" ");break; default:button45.setText("X");}}}
    @FXML void next46(MouseEvent event) {if(notSolved){switch (button46.getText()) {case "X":button46.setText("O");break; case "O":button46.setText(" ");break; default:button46.setText("X");}}}
    @FXML void next47(MouseEvent event) {if(notSolved){switch (button47.getText()) {case "X":button47.setText("O");break; case "O":button47.setText(" ");break; default:button47.setText("X");}}}
    @FXML void next48(MouseEvent event) {if(notSolved){switch (button48.getText()) {case "X":button48.setText("O");break; case "O":button48.setText(" ");break; default:button48.setText("X");}}}
    @FXML void next49(MouseEvent event) {if(notSolved){switch (button49.getText()) {case "X":button49.setText("O");break; case "O":button49.setText(" ");break; default:button49.setText("X");}}}
    @FXML void next50(MouseEvent event) {if(notSolved){switch (button50.getText()) {case "X":button50.setText("O");break; case "O":button50.setText(" ");break; default:button50.setText("X");}}}
    @FXML void next51(MouseEvent event) {if(notSolved){switch (button51.getText()) {case "X":button51.setText("O");break; case "O":button51.setText(" ");break; default:button51.setText("X");}}}
    @FXML void next52(MouseEvent event) {if(notSolved){switch (button52.getText()) {case "X":button52.setText("O");break; case "O":button52.setText(" ");break; default:button52.setText("X");}}}
    @FXML void next53(MouseEvent event) {if(notSolved){switch (button53.getText()) {case "X":button53.setText("O");break; case "O":button53.setText(" ");break; default:button53.setText("X");}}}
    @FXML void next54(MouseEvent event) {if(notSolved){switch (button54.getText()) {case "X":button54.setText("O");break; case "O":button54.setText(" ");break; default:button54.setText("X");}}}
    @FXML void next55(MouseEvent event) {if(notSolved){switch (button55.getText()) {case "X":button55.setText("O");break; case "O":button55.setText(" ");break; default:button55.setText("X");}}}
    @FXML void next56(MouseEvent event) {if(notSolved){switch (button56.getText()) {case "X":button56.setText("O");break; case "O":button56.setText(" ");break; default:button56.setText("X");}}}
    @FXML void next57(MouseEvent event) {if(notSolved){switch (button57.getText()) {case "X":button57.setText("O");break; case "O":button57.setText(" ");break; default:button57.setText("X");}}}
    @FXML void next58(MouseEvent event) {if(notSolved){switch (button58.getText()) {case "X":button58.setText("O");break; case "O":button58.setText(" ");break; default:button58.setText("X");}}}
    @FXML void next59(MouseEvent event) {if(notSolved){switch (button59.getText()) {case "X":button59.setText("O");break; case "O":button59.setText(" ");break; default:button59.setText("X");}}}
    @FXML void next60(MouseEvent event) {if(notSolved){switch (button60.getText()) {case "X":button60.setText("O");break; case "O":button60.setText(" ");break; default:button60.setText("X");}}}
    @FXML void next61(MouseEvent event) {if(notSolved){switch (button61.getText()) {case "X":button61.setText("O");break; case "O":button61.setText(" ");break; default:button61.setText("X");}}}
    @FXML void next62(MouseEvent event) {if(notSolved){switch (button62.getText()) {case "X":button62.setText("O");break; case "O":button62.setText(" ");break; default:button62.setText("X");}}}
    @FXML void next63(MouseEvent event) {if(notSolved){switch (button63.getText()) {case "X":button63.setText("O");break; case "O":button63.setText(" ");break; default:button63.setText("X");}}}
    @FXML void next64(MouseEvent event) {if(notSolved){switch (button64.getText()) {case "X":button64.setText("O");break; case "O":button64.setText(" ");break; default:button64.setText("X");}}}
    @FXML void next65(MouseEvent event) {if(notSolved){switch (button65.getText()) {case "X":button65.setText("O");break; case "O":button65.setText(" ");break; default:button65.setText("X");}}}
    @FXML void next66(MouseEvent event) {if(notSolved){switch (button66.getText()) {case "X":button66.setText("O");break; case "O":button66.setText(" ");break; default:button66.setText("X");}}}
    @FXML void next67(MouseEvent event) {if(notSolved){switch (button67.getText()) {case "X":button67.setText("O");break; case "O":button67.setText(" ");break; default:button67.setText("X");}}}
    @FXML void next68(MouseEvent event) {if(notSolved){switch (button68.getText()) {case "X":button68.setText("O");break; case "O":button68.setText(" ");break; default:button68.setText("X");}}}
    @FXML void next69(MouseEvent event) {if(notSolved){switch (button69.getText()) {case "X":button69.setText("O");break; case "O":button69.setText(" ");break; default:button69.setText("X");}}}
    @FXML void next70(MouseEvent event) {if(notSolved){switch (button70.getText()) {case "X":button70.setText("O");break; case "O":button70.setText(" ");break; default:button70.setText("X");}}}
    @FXML void next71(MouseEvent event) {if(notSolved){switch (button71.getText()) {case "X":button71.setText("O");break; case "O":button71.setText(" ");break; default:button71.setText("X");}}}
    @FXML void next72(MouseEvent event) {if(notSolved){switch (button72.getText()) {case "X":button72.setText("O");break; case "O":button72.setText(" ");break; default:button72.setText("X");}}}
    @FXML void next73(MouseEvent event) {if(notSolved){switch (button73.getText()) {case "X":button73.setText("O");break; case "O":button73.setText(" ");break; default:button73.setText("X");}}}
    @FXML void next74(MouseEvent event) {if(notSolved){switch (button74.getText()) {case "X":button74.setText("O");break; case "O":button74.setText(" ");break; default:button74.setText("X");}}}
    @FXML void next75(MouseEvent event) {if(notSolved){switch (button75.getText()) {case "X":button75.setText("O");break; case "O":button75.setText(" ");break; default:button75.setText("X");}}}
    @FXML void next76(MouseEvent event) {if(notSolved){switch (button76.getText()) {case "X":button76.setText("O");break; case "O":button76.setText(" ");break; default:button76.setText("X");}}}
    @FXML void next77(MouseEvent event) {if(notSolved){switch (button77.getText()) {case "X":button77.setText("O");break; case "O":button77.setText(" ");break; default:button77.setText("X");}}}
    @FXML void next78(MouseEvent event) {if(notSolved){switch (button78.getText()) {case "X":button78.setText("O");break; case "O":button78.setText(" ");break; default:button78.setText("X");}}}
    @FXML void next79(MouseEvent event) {if(notSolved){switch (button79.getText()) {case "X":button79.setText("O");break; case "O":button79.setText(" ");break; default:button79.setText("X");}}}
    @FXML void next80(MouseEvent event) {if(notSolved){switch (button80.getText()) {case "X":button80.setText("O");break; case "O":button80.setText(" ");break; default:button80.setText("X");}}}
    @FXML void next81(MouseEvent event) {if(notSolved){switch (button81.getText()) {case "X":button81.setText("O");break; case "O":button81.setText(" ");break; default:button81.setText("X");}}}
    @FXML void next82(MouseEvent event) {if(notSolved){switch (button82.getText()) {case "X":button82.setText("O");break; case "O":button82.setText(" ");break; default:button82.setText("X");}}}
    @FXML void next83(MouseEvent event) {if(notSolved){switch (button83.getText()) {case "X":button83.setText("O");break; case "O":button83.setText(" ");break; default:button83.setText("X");}}}
    @FXML void next84(MouseEvent event) {if(notSolved){switch (button84.getText()) {case "X":button84.setText("O");break; case "O":button84.setText(" ");break; default:button84.setText("X");}}}
    @FXML void next85(MouseEvent event) {if(notSolved){switch (button85.getText()) {case "X":button85.setText("O");break; case "O":button85.setText(" ");break; default:button85.setText("X");}}}
    @FXML void next86(MouseEvent event) {if(notSolved){switch (button86.getText()) {case "X":button86.setText("O");break; case "O":button86.setText(" ");break; default:button86.setText("X");}}}
    @FXML void next87(MouseEvent event) {if(notSolved){switch (button87.getText()) {case "X":button87.setText("O");break; case "O":button87.setText(" ");break; default:button87.setText("X");}}}
    @FXML void next88(MouseEvent event) {if(notSolved){switch (button88.getText()) {case "X":button88.setText("O");break; case "O":button88.setText(" ");break; default:button88.setText("X");}}}
    @FXML void next89(MouseEvent event) {if(notSolved){switch (button89.getText()) {case "X":button89.setText("O");break; case "O":button89.setText(" ");break; default:button89.setText("X");}}}
    @FXML void next90(MouseEvent event) {if(notSolved){switch (button90.getText()) {case "X":button90.setText("O");break; case "O":button90.setText(" ");break; default:button90.setText("X");}}}
    @FXML void next91(MouseEvent event) {if(notSolved){switch (button91.getText()) {case "X":button91.setText("O");break; case "O":button91.setText(" ");break; default:button91.setText("X");}}}
    @FXML void next92(MouseEvent event) {if(notSolved){switch (button92.getText()) {case "X":button92.setText("O");break; case "O":button92.setText(" ");break; default:button92.setText("X");}}}
    @FXML void next93(MouseEvent event) {if(notSolved){switch (button93.getText()) {case "X":button93.setText("O");break; case "O":button93.setText(" ");break; default:button93.setText("X");}}}
    @FXML void next94(MouseEvent event) {if(notSolved){switch (button94.getText()) {case "X":button94.setText("O");break; case "O":button94.setText(" ");break; default:button94.setText("X");}}}
    @FXML void next95(MouseEvent event) {if(notSolved){switch (button95.getText()) {case "X":button95.setText("O");break; case "O":button95.setText(" ");break; default:button95.setText("X");}}}
    @FXML void next96(MouseEvent event) {if(notSolved){switch (button96.getText()) {case "X":button96.setText("O");break; case "O":button96.setText(" ");break; default:button96.setText("X");}}}
    @FXML void next97(MouseEvent event) {if(notSolved){switch (button97.getText()) {case "X":button97.setText("O");break; case "O":button97.setText(" ");break; default:button97.setText("X");}}}
    @FXML void next98(MouseEvent event) {if(notSolved){switch (button98.getText()) {case "X":button98.setText("O");break; case "O":button98.setText(" ");break; default:button98.setText("X");}}}
    @FXML void next99(MouseEvent event) {if(notSolved){switch (button99.getText()) {case "X":button99.setText("O");break; case "O":button99.setText(" ");break; default:button99.setText("X");}}}

    //reset grid and errors
    @FXML
    void reset(MouseEvent event) {
        notSolved = true;
        button00.setText(" ");button00.setTextFill(Color.BLACK);button01.setText(" ");button01.setTextFill(Color.BLACK);button02.setText(" ");button02.setTextFill(Color.BLACK);button03.setText(" ");button03.setTextFill(Color.BLACK);button04.setText(" ");button04.setTextFill(Color.BLACK);button05.setText(" ");button05.setTextFill(Color.BLACK);button06.setText(" ");button06.setTextFill(Color.BLACK);button07.setText(" ");button07.setTextFill(Color.BLACK);button08.setText(" ");button08.setTextFill(Color.BLACK);button09.setText(" ");button09.setTextFill(Color.BLACK);
        button10.setText(" ");button10.setTextFill(Color.BLACK);button11.setText(" ");button11.setTextFill(Color.BLACK);button12.setText(" ");button12.setTextFill(Color.BLACK);button13.setText(" ");button13.setTextFill(Color.BLACK);button14.setText(" ");button14.setTextFill(Color.BLACK);button15.setText(" ");button15.setTextFill(Color.BLACK);button16.setText(" ");button16.setTextFill(Color.BLACK);button17.setText(" ");button17.setTextFill(Color.BLACK);button18.setText(" ");button18.setTextFill(Color.BLACK);button19.setText(" ");button19.setTextFill(Color.BLACK);
        button20.setText(" ");button20.setTextFill(Color.BLACK);button21.setText(" ");button21.setTextFill(Color.BLACK);button22.setText(" ");button22.setTextFill(Color.BLACK);button23.setText(" ");button23.setTextFill(Color.BLACK);button24.setText(" ");button24.setTextFill(Color.BLACK);button25.setText(" ");button25.setTextFill(Color.BLACK);button26.setText(" ");button26.setTextFill(Color.BLACK);button27.setText(" ");button27.setTextFill(Color.BLACK);button28.setText(" ");button28.setTextFill(Color.BLACK);button29.setText(" ");button29.setTextFill(Color.BLACK);
        button30.setText(" ");button30.setTextFill(Color.BLACK);button31.setText(" ");button31.setTextFill(Color.BLACK);button32.setText(" ");button32.setTextFill(Color.BLACK);button33.setText(" ");button33.setTextFill(Color.BLACK);button34.setText(" ");button34.setTextFill(Color.BLACK);button35.setText(" ");button35.setTextFill(Color.BLACK);button36.setText(" ");button36.setTextFill(Color.BLACK);button37.setText(" ");button37.setTextFill(Color.BLACK);button38.setText(" ");button38.setTextFill(Color.BLACK);button39.setText(" ");button39.setTextFill(Color.BLACK);
        button40.setText(" ");button40.setTextFill(Color.BLACK);button41.setText(" ");button41.setTextFill(Color.BLACK);button42.setText(" ");button42.setTextFill(Color.BLACK);button43.setText(" ");button43.setTextFill(Color.BLACK);button44.setText(" ");button44.setTextFill(Color.BLACK);button45.setText(" ");button45.setTextFill(Color.BLACK);button46.setText(" ");button46.setTextFill(Color.BLACK);button47.setText(" ");button47.setTextFill(Color.BLACK);button48.setText(" ");button48.setTextFill(Color.BLACK);button49.setText(" ");button49.setTextFill(Color.BLACK);
        button50.setText(" ");button50.setTextFill(Color.BLACK);button51.setText(" ");button51.setTextFill(Color.BLACK);button52.setText(" ");button52.setTextFill(Color.BLACK);button53.setText(" ");button53.setTextFill(Color.BLACK);button54.setText(" ");button54.setTextFill(Color.BLACK);button55.setText(" ");button55.setTextFill(Color.BLACK);button56.setText(" ");button56.setTextFill(Color.BLACK);button57.setText(" ");button57.setTextFill(Color.BLACK);button58.setText(" ");button58.setTextFill(Color.BLACK);button59.setText(" ");button59.setTextFill(Color.BLACK);
        button60.setText(" ");button60.setTextFill(Color.BLACK);button61.setText(" ");button61.setTextFill(Color.BLACK);button62.setText(" ");button62.setTextFill(Color.BLACK);button63.setText(" ");button63.setTextFill(Color.BLACK);button64.setText(" ");button64.setTextFill(Color.BLACK);button65.setText(" ");button65.setTextFill(Color.BLACK);button66.setText(" ");button66.setTextFill(Color.BLACK);button67.setText(" ");button67.setTextFill(Color.BLACK);button68.setText(" ");button68.setTextFill(Color.BLACK);button69.setText(" ");button69.setTextFill(Color.BLACK);
        button70.setText(" ");button70.setTextFill(Color.BLACK);button71.setText(" ");button71.setTextFill(Color.BLACK);button72.setText(" ");button72.setTextFill(Color.BLACK);button73.setText(" ");button73.setTextFill(Color.BLACK);button74.setText(" ");button74.setTextFill(Color.BLACK);button75.setText(" ");button75.setTextFill(Color.BLACK);button76.setText(" ");button76.setTextFill(Color.BLACK);button77.setText(" ");button77.setTextFill(Color.BLACK);button78.setText(" ");button78.setTextFill(Color.BLACK);button79.setText(" ");button79.setTextFill(Color.BLACK);
        button80.setText(" ");button80.setTextFill(Color.BLACK);button81.setText(" ");button81.setTextFill(Color.BLACK);button82.setText(" ");button82.setTextFill(Color.BLACK);button83.setText(" ");button83.setTextFill(Color.BLACK);button84.setText(" ");button84.setTextFill(Color.BLACK);button85.setText(" ");button85.setTextFill(Color.BLACK);button86.setText(" ");button86.setTextFill(Color.BLACK);button87.setText(" ");button87.setTextFill(Color.BLACK);button88.setText(" ");button88.setTextFill(Color.BLACK);button89.setText(" ");button89.setTextFill(Color.BLACK);
        button90.setText(" ");button90.setTextFill(Color.BLACK);button91.setText(" ");button91.setTextFill(Color.BLACK);button92.setText(" ");button92.setTextFill(Color.BLACK);button93.setText(" ");button93.setTextFill(Color.BLACK);button94.setText(" ");button94.setTextFill(Color.BLACK);button95.setText(" ");button95.setTextFill(Color.BLACK);button96.setText(" ");button96.setTextFill(Color.BLACK);button97.setText(" ");button97.setTextFill(Color.BLACK);button98.setText(" ");button98.setTextFill(Color.BLACK);button99.setText(" ");button99.setTextFill(Color.BLACK);
        errors.setText("");
        errors.setTextFill(Color.RED);
    }

    //Complete solve
    @FXML
    void solve(MouseEvent event) {
        notSolved = false;
        int untilFinish = 0;
        if(button00.getText().charAt(0) == ' ') {button00.setTextFill(Color.RED);}
        if(button01.getText().charAt(0) == ' ') {button01.setTextFill(Color.RED);}
        if(button02.getText().charAt(0) == ' ') {button02.setTextFill(Color.RED);}
        if(button03.getText().charAt(0) == ' ') {button03.setTextFill(Color.RED);}
        if(button04.getText().charAt(0) == ' ') {button04.setTextFill(Color.RED);}
        if(button05.getText().charAt(0) == ' ') {button05.setTextFill(Color.RED);}
        if(button06.getText().charAt(0) == ' ') {button06.setTextFill(Color.RED);}
        if(button07.getText().charAt(0) == ' ') {button07.setTextFill(Color.RED);}
        if(button08.getText().charAt(0) == ' ') {button08.setTextFill(Color.RED);}
        if(button09.getText().charAt(0) == ' ') {button09.setTextFill(Color.RED);}
        if(button10.getText().charAt(0) == ' ') {button10.setTextFill(Color.RED);}
        if(button11.getText().charAt(0) == ' ') {button11.setTextFill(Color.RED);}
        if(button12.getText().charAt(0) == ' ') {button12.setTextFill(Color.RED);}
        if(button13.getText().charAt(0) == ' ') {button13.setTextFill(Color.RED);}
        if(button14.getText().charAt(0) == ' ') {button14.setTextFill(Color.RED);}
        if(button15.getText().charAt(0) == ' ') {button15.setTextFill(Color.RED);}
        if(button16.getText().charAt(0) == ' ') {button16.setTextFill(Color.RED);}
        if(button17.getText().charAt(0) == ' ') {button17.setTextFill(Color.RED);}
        if(button18.getText().charAt(0) == ' ') {button18.setTextFill(Color.RED);}
        if(button19.getText().charAt(0) == ' ') {button19.setTextFill(Color.RED);}
        if(button20.getText().charAt(0) == ' ') {button20.setTextFill(Color.RED);}
        if(button21.getText().charAt(0) == ' ') {button21.setTextFill(Color.RED);}
        if(button22.getText().charAt(0) == ' ') {button22.setTextFill(Color.RED);}
        if(button23.getText().charAt(0) == ' ') {button23.setTextFill(Color.RED);}
        if(button24.getText().charAt(0) == ' ') {button24.setTextFill(Color.RED);}
        if(button25.getText().charAt(0) == ' ') {button25.setTextFill(Color.RED);}
        if(button26.getText().charAt(0) == ' ') {button26.setTextFill(Color.RED);}
        if(button27.getText().charAt(0) == ' ') {button27.setTextFill(Color.RED);}
        if(button28.getText().charAt(0) == ' ') {button28.setTextFill(Color.RED);}
        if(button29.getText().charAt(0) == ' ') {button29.setTextFill(Color.RED);}
        if(button30.getText().charAt(0) == ' ') {button30.setTextFill(Color.RED);}
        if(button31.getText().charAt(0) == ' ') {button31.setTextFill(Color.RED);}
        if(button32.getText().charAt(0) == ' ') {button32.setTextFill(Color.RED);}
        if(button33.getText().charAt(0) == ' ') {button33.setTextFill(Color.RED);}
        if(button34.getText().charAt(0) == ' ') {button34.setTextFill(Color.RED);}
        if(button35.getText().charAt(0) == ' ') {button35.setTextFill(Color.RED);}
        if(button36.getText().charAt(0) == ' ') {button36.setTextFill(Color.RED);}
        if(button37.getText().charAt(0) == ' ') {button37.setTextFill(Color.RED);}
        if(button38.getText().charAt(0) == ' ') {button38.setTextFill(Color.RED);}
        if(button39.getText().charAt(0) == ' ') {button39.setTextFill(Color.RED);}
        if(button40.getText().charAt(0) == ' ') {button40.setTextFill(Color.RED);}
        if(button41.getText().charAt(0) == ' ') {button41.setTextFill(Color.RED);}
        if(button42.getText().charAt(0) == ' ') {button42.setTextFill(Color.RED);}
        if(button43.getText().charAt(0) == ' ') {button43.setTextFill(Color.RED);}
        if(button44.getText().charAt(0) == ' ') {button44.setTextFill(Color.RED);}
        if(button45.getText().charAt(0) == ' ') {button45.setTextFill(Color.RED);}
        if(button46.getText().charAt(0) == ' ') {button46.setTextFill(Color.RED);}
        if(button47.getText().charAt(0) == ' ') {button47.setTextFill(Color.RED);}
        if(button48.getText().charAt(0) == ' ') {button48.setTextFill(Color.RED);}
        if(button49.getText().charAt(0) == ' ') {button49.setTextFill(Color.RED);}
        if(button50.getText().charAt(0) == ' ') {button50.setTextFill(Color.RED);}
        if(button51.getText().charAt(0) == ' ') {button51.setTextFill(Color.RED);}
        if(button52.getText().charAt(0) == ' ') {button52.setTextFill(Color.RED);}
        if(button53.getText().charAt(0) == ' ') {button53.setTextFill(Color.RED);}
        if(button54.getText().charAt(0) == ' ') {button54.setTextFill(Color.RED);}
        if(button55.getText().charAt(0) == ' ') {button55.setTextFill(Color.RED);}
        if(button56.getText().charAt(0) == ' ') {button56.setTextFill(Color.RED);}
        if(button57.getText().charAt(0) == ' ') {button57.setTextFill(Color.RED);}
        if(button58.getText().charAt(0) == ' ') {button58.setTextFill(Color.RED);}
        if(button59.getText().charAt(0) == ' ') {button59.setTextFill(Color.RED);}
        if(button60.getText().charAt(0) == ' ') {button60.setTextFill(Color.RED);}
        if(button61.getText().charAt(0) == ' ') {button61.setTextFill(Color.RED);}
        if(button62.getText().charAt(0) == ' ') {button62.setTextFill(Color.RED);}
        if(button63.getText().charAt(0) == ' ') {button63.setTextFill(Color.RED);}
        if(button64.getText().charAt(0) == ' ') {button64.setTextFill(Color.RED);}
        if(button65.getText().charAt(0) == ' ') {button65.setTextFill(Color.RED);}
        if(button66.getText().charAt(0) == ' ') {button66.setTextFill(Color.RED);}
        if(button67.getText().charAt(0) == ' ') {button67.setTextFill(Color.RED);}
        if(button68.getText().charAt(0) == ' ') {button68.setTextFill(Color.RED);}
        if(button69.getText().charAt(0) == ' ') {button69.setTextFill(Color.RED);}
        if(button70.getText().charAt(0) == ' ') {button70.setTextFill(Color.RED);}
        if(button71.getText().charAt(0) == ' ') {button71.setTextFill(Color.RED);}
        if(button72.getText().charAt(0) == ' ') {button72.setTextFill(Color.RED);}
        if(button73.getText().charAt(0) == ' ') {button73.setTextFill(Color.RED);}
        if(button74.getText().charAt(0) == ' ') {button74.setTextFill(Color.RED);}
        if(button75.getText().charAt(0) == ' ') {button75.setTextFill(Color.RED);}
        if(button76.getText().charAt(0) == ' ') {button76.setTextFill(Color.RED);}
        if(button77.getText().charAt(0) == ' ') {button77.setTextFill(Color.RED);}
        if(button78.getText().charAt(0) == ' ') {button78.setTextFill(Color.RED);}
        if(button79.getText().charAt(0) == ' ') {button79.setTextFill(Color.RED);}
        if(button80.getText().charAt(0) == ' ') {button80.setTextFill(Color.RED);}
        if(button81.getText().charAt(0) == ' ') {button81.setTextFill(Color.RED);}
        if(button82.getText().charAt(0) == ' ') {button82.setTextFill(Color.RED);}
        if(button83.getText().charAt(0) == ' ') {button83.setTextFill(Color.RED);}
        if(button84.getText().charAt(0) == ' ') {button84.setTextFill(Color.RED);}
        if(button85.getText().charAt(0) == ' ') {button85.setTextFill(Color.RED);}
        if(button86.getText().charAt(0) == ' ') {button86.setTextFill(Color.RED);}
        if(button87.getText().charAt(0) == ' ') {button87.setTextFill(Color.RED);}
        if(button88.getText().charAt(0) == ' ') {button88.setTextFill(Color.RED);}
        if(button89.getText().charAt(0) == ' ') {button89.setTextFill(Color.RED);}
        if(button90.getText().charAt(0) == ' ') {button90.setTextFill(Color.RED);}
        if(button91.getText().charAt(0) == ' ') {button91.setTextFill(Color.RED);}
        if(button92.getText().charAt(0) == ' ') {button92.setTextFill(Color.RED);}
        if(button93.getText().charAt(0) == ' ') {button93.setTextFill(Color.RED);}
        if(button94.getText().charAt(0) == ' ') {button94.setTextFill(Color.RED);}
        if(button95.getText().charAt(0) == ' ') {button95.setTextFill(Color.RED);}
        if(button96.getText().charAt(0) == ' ') {button96.setTextFill(Color.RED);}
        if(button97.getText().charAt(0) == ' ') {button97.setTextFill(Color.RED);}
        if(button98.getText().charAt(0) == ' ') {button98.setTextFill(Color.RED);}
        if(button99.getText().charAt(0) == ' ') {button99.setTextFill(Color.RED);}

        char[][] userGridinput = {
                {button00.getText().charAt(0), button01.getText().charAt(0), button02.getText().charAt(0), button03.getText().charAt(0), button04.getText().charAt(0), button05.getText().charAt(0), button06.getText().charAt(0), button07.getText().charAt(0), button08.getText().charAt(0), button09.getText().charAt(0)},
                {button10.getText().charAt(0), button11.getText().charAt(0), button12.getText().charAt(0), button13.getText().charAt(0), button14.getText().charAt(0), button15.getText().charAt(0), button16.getText().charAt(0), button17.getText().charAt(0), button18.getText().charAt(0), button19.getText().charAt(0)},
                {button20.getText().charAt(0), button21.getText().charAt(0), button22.getText().charAt(0), button23.getText().charAt(0), button24.getText().charAt(0), button25.getText().charAt(0), button26.getText().charAt(0), button27.getText().charAt(0), button28.getText().charAt(0), button29.getText().charAt(0)},
                {button30.getText().charAt(0), button31.getText().charAt(0), button32.getText().charAt(0), button33.getText().charAt(0), button34.getText().charAt(0), button35.getText().charAt(0), button36.getText().charAt(0), button37.getText().charAt(0), button38.getText().charAt(0), button39.getText().charAt(0)},
                {button40.getText().charAt(0), button41.getText().charAt(0), button42.getText().charAt(0), button43.getText().charAt(0), button44.getText().charAt(0), button45.getText().charAt(0), button46.getText().charAt(0), button47.getText().charAt(0), button48.getText().charAt(0), button49.getText().charAt(0)},
                {button50.getText().charAt(0), button51.getText().charAt(0), button52.getText().charAt(0), button53.getText().charAt(0), button54.getText().charAt(0), button55.getText().charAt(0), button56.getText().charAt(0), button57.getText().charAt(0), button58.getText().charAt(0), button59.getText().charAt(0)},
                {button60.getText().charAt(0), button61.getText().charAt(0), button62.getText().charAt(0), button63.getText().charAt(0), button64.getText().charAt(0), button65.getText().charAt(0), button66.getText().charAt(0), button67.getText().charAt(0), button68.getText().charAt(0), button69.getText().charAt(0)},
                {button70.getText().charAt(0), button71.getText().charAt(0), button72.getText().charAt(0), button73.getText().charAt(0), button74.getText().charAt(0), button75.getText().charAt(0), button76.getText().charAt(0), button77.getText().charAt(0), button78.getText().charAt(0), button79.getText().charAt(0)},
                {button80.getText().charAt(0), button81.getText().charAt(0), button82.getText().charAt(0), button83.getText().charAt(0), button84.getText().charAt(0), button85.getText().charAt(0), button86.getText().charAt(0), button87.getText().charAt(0), button88.getText().charAt(0), button89.getText().charAt(0)},
                {button90.getText().charAt(0), button91.getText().charAt(0), button92.getText().charAt(0), button93.getText().charAt(0), button94.getText().charAt(0), button95.getText().charAt(0), button96.getText().charAt(0), button97.getText().charAt(0), button98.getText().charAt(0), button99.getText().charAt(0)},
        };
        Grid userGrid = new Grid(userGridinput);
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(userGrid.getIndexUtserGrid(i,j) == ' ') {
                    untilFinish++;
                }
            }
        }
        //solve
        while (untilFinish >= 0) {
            switch (userGrid.getErrors()) {
                case 0:
                    char[][] solutionGrid = userGrid.solveGrid();
                    //display
                    button00.setText(Character.toString(solutionGrid[0][0]));
                    button01.setText(Character.toString(solutionGrid[0][1]));
                    button02.setText(Character.toString(solutionGrid[0][2]));
                    button03.setText(Character.toString(solutionGrid[0][3]));
                    button04.setText(Character.toString(solutionGrid[0][4]));
                    button05.setText(Character.toString(solutionGrid[0][5]));
                    button06.setText(Character.toString(solutionGrid[0][6]));
                    button07.setText(Character.toString(solutionGrid[0][7]));
                    button08.setText(Character.toString(solutionGrid[0][8]));
                    button09.setText(Character.toString(solutionGrid[0][9]));
                    button10.setText(Character.toString(solutionGrid[1][0]));
                    button11.setText(Character.toString(solutionGrid[1][1]));
                    button12.setText(Character.toString(solutionGrid[1][2]));
                    button13.setText(Character.toString(solutionGrid[1][3]));
                    button14.setText(Character.toString(solutionGrid[1][4]));
                    button15.setText(Character.toString(solutionGrid[1][5]));
                    button16.setText(Character.toString(solutionGrid[1][6]));
                    button17.setText(Character.toString(solutionGrid[1][7]));
                    button18.setText(Character.toString(solutionGrid[1][8]));
                    button19.setText(Character.toString(solutionGrid[1][9]));
                    button20.setText(Character.toString(solutionGrid[2][0]));
                    button21.setText(Character.toString(solutionGrid[2][1]));
                    button22.setText(Character.toString(solutionGrid[2][2]));
                    button23.setText(Character.toString(solutionGrid[2][3]));
                    button24.setText(Character.toString(solutionGrid[2][4]));
                    button25.setText(Character.toString(solutionGrid[2][5]));
                    button26.setText(Character.toString(solutionGrid[2][6]));
                    button27.setText(Character.toString(solutionGrid[2][7]));
                    button28.setText(Character.toString(solutionGrid[2][8]));
                    button29.setText(Character.toString(solutionGrid[2][9]));
                    button30.setText(Character.toString(solutionGrid[3][0]));
                    button31.setText(Character.toString(solutionGrid[3][1]));
                    button32.setText(Character.toString(solutionGrid[3][2]));
                    button33.setText(Character.toString(solutionGrid[3][3]));
                    button34.setText(Character.toString(solutionGrid[3][4]));
                    button35.setText(Character.toString(solutionGrid[3][5]));
                    button36.setText(Character.toString(solutionGrid[3][6]));
                    button37.setText(Character.toString(solutionGrid[3][7]));
                    button38.setText(Character.toString(solutionGrid[3][8]));
                    button39.setText(Character.toString(solutionGrid[3][9]));
                    button40.setText(Character.toString(solutionGrid[4][0]));
                    button41.setText(Character.toString(solutionGrid[4][1]));
                    button42.setText(Character.toString(solutionGrid[4][2]));
                    button43.setText(Character.toString(solutionGrid[4][3]));
                    button44.setText(Character.toString(solutionGrid[4][4]));
                    button45.setText(Character.toString(solutionGrid[4][5]));
                    button46.setText(Character.toString(solutionGrid[4][6]));
                    button47.setText(Character.toString(solutionGrid[4][7]));
                    button48.setText(Character.toString(solutionGrid[4][8]));
                    button49.setText(Character.toString(solutionGrid[4][9]));
                    button50.setText(Character.toString(solutionGrid[5][0]));
                    button51.setText(Character.toString(solutionGrid[5][1]));
                    button52.setText(Character.toString(solutionGrid[5][2]));
                    button53.setText(Character.toString(solutionGrid[5][3]));
                    button54.setText(Character.toString(solutionGrid[5][4]));
                    button55.setText(Character.toString(solutionGrid[5][5]));
                    button56.setText(Character.toString(solutionGrid[5][6]));
                    button57.setText(Character.toString(solutionGrid[5][7]));
                    button58.setText(Character.toString(solutionGrid[5][8]));
                    button59.setText(Character.toString(solutionGrid[5][9]));
                    button60.setText(Character.toString(solutionGrid[6][0]));
                    button61.setText(Character.toString(solutionGrid[6][1]));
                    button62.setText(Character.toString(solutionGrid[6][2]));
                    button63.setText(Character.toString(solutionGrid[6][3]));
                    button64.setText(Character.toString(solutionGrid[6][4]));
                    button65.setText(Character.toString(solutionGrid[6][5]));
                    button66.setText(Character.toString(solutionGrid[6][6]));
                    button67.setText(Character.toString(solutionGrid[6][7]));
                    button68.setText(Character.toString(solutionGrid[6][8]));
                    button69.setText(Character.toString(solutionGrid[6][9]));
                    button70.setText(Character.toString(solutionGrid[7][0]));
                    button71.setText(Character.toString(solutionGrid[7][1]));
                    button72.setText(Character.toString(solutionGrid[7][2]));
                    button73.setText(Character.toString(solutionGrid[7][3]));
                    button74.setText(Character.toString(solutionGrid[7][4]));
                    button75.setText(Character.toString(solutionGrid[7][5]));
                    button76.setText(Character.toString(solutionGrid[7][6]));
                    button77.setText(Character.toString(solutionGrid[7][7]));
                    button78.setText(Character.toString(solutionGrid[7][8]));
                    button79.setText(Character.toString(solutionGrid[7][9]));
                    button80.setText(Character.toString(solutionGrid[8][0]));
                    button81.setText(Character.toString(solutionGrid[8][1]));
                    button82.setText(Character.toString(solutionGrid[8][2]));
                    button83.setText(Character.toString(solutionGrid[8][3]));
                    button84.setText(Character.toString(solutionGrid[8][4]));
                    button85.setText(Character.toString(solutionGrid[8][5]));
                    button86.setText(Character.toString(solutionGrid[8][6]));
                    button87.setText(Character.toString(solutionGrid[8][7]));
                    button88.setText(Character.toString(solutionGrid[8][8]));
                    button89.setText(Character.toString(solutionGrid[8][9]));
                    button90.setText(Character.toString(solutionGrid[9][0]));
                    button91.setText(Character.toString(solutionGrid[9][1]));
                    button92.setText(Character.toString(solutionGrid[9][2]));
                    button93.setText(Character.toString(solutionGrid[9][3]));
                    button94.setText(Character.toString(solutionGrid[9][4]));
                    button95.setText(Character.toString(solutionGrid[9][5]));
                    button96.setText(Character.toString(solutionGrid[9][6]));
                    button97.setText(Character.toString(solutionGrid[9][7]));
                    button98.setText(Character.toString(solutionGrid[9][8]));
                    button99.setText(Character.toString(solutionGrid[9][9]));
                    untilFinish--;
                    break;
                case 1:
                    //error #1
                    errors.setText("Multiple Solution detected");
                    untilFinish = -1;
                    break;
                case 2:
                    //error #1
                    errors.setText("No Solution detected");
                    untilFinish = -1;
                    break;
                default:
                    //default/unknown Error
                    break;
            }
        }
        errors.setTextFill(Color.GREEN);
        errors.setText("OK");
    }



    public void stepbystep (MouseEvent mouseEvent) {
        notSolved = false;
        int untilFinish = 0;
        if(button00.getText().charAt(0) == ' ') {button00.setTextFill(Color.RED);}
        if(button01.getText().charAt(0) == ' ') {button01.setTextFill(Color.RED);}
        if(button02.getText().charAt(0) == ' ') {button02.setTextFill(Color.RED);}
        if(button03.getText().charAt(0) == ' ') {button03.setTextFill(Color.RED);}
        if(button04.getText().charAt(0) == ' ') {button04.setTextFill(Color.RED);}
        if(button05.getText().charAt(0) == ' ') {button05.setTextFill(Color.RED);}
        if(button06.getText().charAt(0) == ' ') {button06.setTextFill(Color.RED);}
        if(button07.getText().charAt(0) == ' ') {button07.setTextFill(Color.RED);}
        if(button08.getText().charAt(0) == ' ') {button08.setTextFill(Color.RED);}
        if(button09.getText().charAt(0) == ' ') {button09.setTextFill(Color.RED);}
        if(button10.getText().charAt(0) == ' ') {button10.setTextFill(Color.RED);}
        if(button11.getText().charAt(0) == ' ') {button11.setTextFill(Color.RED);}
        if(button12.getText().charAt(0) == ' ') {button12.setTextFill(Color.RED);}
        if(button13.getText().charAt(0) == ' ') {button13.setTextFill(Color.RED);}
        if(button14.getText().charAt(0) == ' ') {button14.setTextFill(Color.RED);}
        if(button15.getText().charAt(0) == ' ') {button15.setTextFill(Color.RED);}
        if(button16.getText().charAt(0) == ' ') {button16.setTextFill(Color.RED);}
        if(button17.getText().charAt(0) == ' ') {button17.setTextFill(Color.RED);}
        if(button18.getText().charAt(0) == ' ') {button18.setTextFill(Color.RED);}
        if(button19.getText().charAt(0) == ' ') {button19.setTextFill(Color.RED);}
        if(button20.getText().charAt(0) == ' ') {button20.setTextFill(Color.RED);}
        if(button21.getText().charAt(0) == ' ') {button21.setTextFill(Color.RED);}
        if(button22.getText().charAt(0) == ' ') {button22.setTextFill(Color.RED);}
        if(button23.getText().charAt(0) == ' ') {button23.setTextFill(Color.RED);}
        if(button24.getText().charAt(0) == ' ') {button24.setTextFill(Color.RED);}
        if(button25.getText().charAt(0) == ' ') {button25.setTextFill(Color.RED);}
        if(button26.getText().charAt(0) == ' ') {button26.setTextFill(Color.RED);}
        if(button27.getText().charAt(0) == ' ') {button27.setTextFill(Color.RED);}
        if(button28.getText().charAt(0) == ' ') {button28.setTextFill(Color.RED);}
        if(button29.getText().charAt(0) == ' ') {button29.setTextFill(Color.RED);}
        if(button30.getText().charAt(0) == ' ') {button30.setTextFill(Color.RED);}
        if(button31.getText().charAt(0) == ' ') {button31.setTextFill(Color.RED);}
        if(button32.getText().charAt(0) == ' ') {button32.setTextFill(Color.RED);}
        if(button33.getText().charAt(0) == ' ') {button33.setTextFill(Color.RED);}
        if(button34.getText().charAt(0) == ' ') {button34.setTextFill(Color.RED);}
        if(button35.getText().charAt(0) == ' ') {button35.setTextFill(Color.RED);}
        if(button36.getText().charAt(0) == ' ') {button36.setTextFill(Color.RED);}
        if(button37.getText().charAt(0) == ' ') {button37.setTextFill(Color.RED);}
        if(button38.getText().charAt(0) == ' ') {button38.setTextFill(Color.RED);}
        if(button39.getText().charAt(0) == ' ') {button39.setTextFill(Color.RED);}
        if(button40.getText().charAt(0) == ' ') {button40.setTextFill(Color.RED);}
        if(button41.getText().charAt(0) == ' ') {button41.setTextFill(Color.RED);}
        if(button42.getText().charAt(0) == ' ') {button42.setTextFill(Color.RED);}
        if(button43.getText().charAt(0) == ' ') {button43.setTextFill(Color.RED);}
        if(button44.getText().charAt(0) == ' ') {button44.setTextFill(Color.RED);}
        if(button45.getText().charAt(0) == ' ') {button45.setTextFill(Color.RED);}
        if(button46.getText().charAt(0) == ' ') {button46.setTextFill(Color.RED);}
        if(button47.getText().charAt(0) == ' ') {button47.setTextFill(Color.RED);}
        if(button48.getText().charAt(0) == ' ') {button48.setTextFill(Color.RED);}
        if(button49.getText().charAt(0) == ' ') {button49.setTextFill(Color.RED);}
        if(button50.getText().charAt(0) == ' ') {button50.setTextFill(Color.RED);}
        if(button51.getText().charAt(0) == ' ') {button51.setTextFill(Color.RED);}
        if(button52.getText().charAt(0) == ' ') {button52.setTextFill(Color.RED);}
        if(button53.getText().charAt(0) == ' ') {button53.setTextFill(Color.RED);}
        if(button54.getText().charAt(0) == ' ') {button54.setTextFill(Color.RED);}
        if(button55.getText().charAt(0) == ' ') {button55.setTextFill(Color.RED);}
        if(button56.getText().charAt(0) == ' ') {button56.setTextFill(Color.RED);}
        if(button57.getText().charAt(0) == ' ') {button57.setTextFill(Color.RED);}
        if(button58.getText().charAt(0) == ' ') {button58.setTextFill(Color.RED);}
        if(button59.getText().charAt(0) == ' ') {button59.setTextFill(Color.RED);}
        if(button60.getText().charAt(0) == ' ') {button60.setTextFill(Color.RED);}
        if(button61.getText().charAt(0) == ' ') {button61.setTextFill(Color.RED);}
        if(button62.getText().charAt(0) == ' ') {button62.setTextFill(Color.RED);}
        if(button63.getText().charAt(0) == ' ') {button63.setTextFill(Color.RED);}
        if(button64.getText().charAt(0) == ' ') {button64.setTextFill(Color.RED);}
        if(button65.getText().charAt(0) == ' ') {button65.setTextFill(Color.RED);}
        if(button66.getText().charAt(0) == ' ') {button66.setTextFill(Color.RED);}
        if(button67.getText().charAt(0) == ' ') {button67.setTextFill(Color.RED);}
        if(button68.getText().charAt(0) == ' ') {button68.setTextFill(Color.RED);}
        if(button69.getText().charAt(0) == ' ') {button69.setTextFill(Color.RED);}
        if(button70.getText().charAt(0) == ' ') {button70.setTextFill(Color.RED);}
        if(button71.getText().charAt(0) == ' ') {button71.setTextFill(Color.RED);}
        if(button72.getText().charAt(0) == ' ') {button72.setTextFill(Color.RED);}
        if(button73.getText().charAt(0) == ' ') {button73.setTextFill(Color.RED);}
        if(button74.getText().charAt(0) == ' ') {button74.setTextFill(Color.RED);}
        if(button75.getText().charAt(0) == ' ') {button75.setTextFill(Color.RED);}
        if(button76.getText().charAt(0) == ' ') {button76.setTextFill(Color.RED);}
        if(button77.getText().charAt(0) == ' ') {button77.setTextFill(Color.RED);}
        if(button78.getText().charAt(0) == ' ') {button78.setTextFill(Color.RED);}
        if(button79.getText().charAt(0) == ' ') {button79.setTextFill(Color.RED);}
        if(button80.getText().charAt(0) == ' ') {button80.setTextFill(Color.RED);}
        if(button81.getText().charAt(0) == ' ') {button81.setTextFill(Color.RED);}
        if(button82.getText().charAt(0) == ' ') {button82.setTextFill(Color.RED);}
        if(button83.getText().charAt(0) == ' ') {button83.setTextFill(Color.RED);}
        if(button84.getText().charAt(0) == ' ') {button84.setTextFill(Color.RED);}
        if(button85.getText().charAt(0) == ' ') {button85.setTextFill(Color.RED);}
        if(button86.getText().charAt(0) == ' ') {button86.setTextFill(Color.RED);}
        if(button87.getText().charAt(0) == ' ') {button87.setTextFill(Color.RED);}
        if(button88.getText().charAt(0) == ' ') {button88.setTextFill(Color.RED);}
        if(button89.getText().charAt(0) == ' ') {button89.setTextFill(Color.RED);}
        if(button90.getText().charAt(0) == ' ') {button90.setTextFill(Color.RED);}
        if(button91.getText().charAt(0) == ' ') {button91.setTextFill(Color.RED);}
        if(button92.getText().charAt(0) == ' ') {button92.setTextFill(Color.RED);}
        if(button93.getText().charAt(0) == ' ') {button93.setTextFill(Color.RED);}
        if(button94.getText().charAt(0) == ' ') {button94.setTextFill(Color.RED);}
        if(button95.getText().charAt(0) == ' ') {button95.setTextFill(Color.RED);}
        if(button96.getText().charAt(0) == ' ') {button96.setTextFill(Color.RED);}
        if(button97.getText().charAt(0) == ' ') {button97.setTextFill(Color.RED);}
        if(button98.getText().charAt(0) == ' ') {button98.setTextFill(Color.RED);}
        if(button99.getText().charAt(0) == ' ') {button99.setTextFill(Color.RED);}

        char[][] userGridinput = {
                {button00.getText().charAt(0), button01.getText().charAt(0), button02.getText().charAt(0), button03.getText().charAt(0), button04.getText().charAt(0), button05.getText().charAt(0), button06.getText().charAt(0), button07.getText().charAt(0), button08.getText().charAt(0), button09.getText().charAt(0)},
                {button10.getText().charAt(0), button11.getText().charAt(0), button12.getText().charAt(0), button13.getText().charAt(0), button14.getText().charAt(0), button15.getText().charAt(0), button16.getText().charAt(0), button17.getText().charAt(0), button18.getText().charAt(0), button19.getText().charAt(0)},
                {button20.getText().charAt(0), button21.getText().charAt(0), button22.getText().charAt(0), button23.getText().charAt(0), button24.getText().charAt(0), button25.getText().charAt(0), button26.getText().charAt(0), button27.getText().charAt(0), button28.getText().charAt(0), button29.getText().charAt(0)},
                {button30.getText().charAt(0), button31.getText().charAt(0), button32.getText().charAt(0), button33.getText().charAt(0), button34.getText().charAt(0), button35.getText().charAt(0), button36.getText().charAt(0), button37.getText().charAt(0), button38.getText().charAt(0), button39.getText().charAt(0)},
                {button40.getText().charAt(0), button41.getText().charAt(0), button42.getText().charAt(0), button43.getText().charAt(0), button44.getText().charAt(0), button45.getText().charAt(0), button46.getText().charAt(0), button47.getText().charAt(0), button48.getText().charAt(0), button49.getText().charAt(0)},
                {button50.getText().charAt(0), button51.getText().charAt(0), button52.getText().charAt(0), button53.getText().charAt(0), button54.getText().charAt(0), button55.getText().charAt(0), button56.getText().charAt(0), button57.getText().charAt(0), button58.getText().charAt(0), button59.getText().charAt(0)},
                {button60.getText().charAt(0), button61.getText().charAt(0), button62.getText().charAt(0), button63.getText().charAt(0), button64.getText().charAt(0), button65.getText().charAt(0), button66.getText().charAt(0), button67.getText().charAt(0), button68.getText().charAt(0), button69.getText().charAt(0)},
                {button70.getText().charAt(0), button71.getText().charAt(0), button72.getText().charAt(0), button73.getText().charAt(0), button74.getText().charAt(0), button75.getText().charAt(0), button76.getText().charAt(0), button77.getText().charAt(0), button78.getText().charAt(0), button79.getText().charAt(0)},
                {button80.getText().charAt(0), button81.getText().charAt(0), button82.getText().charAt(0), button83.getText().charAt(0), button84.getText().charAt(0), button85.getText().charAt(0), button86.getText().charAt(0), button87.getText().charAt(0), button88.getText().charAt(0), button89.getText().charAt(0)},
                {button90.getText().charAt(0), button91.getText().charAt(0), button92.getText().charAt(0), button93.getText().charAt(0), button94.getText().charAt(0), button95.getText().charAt(0), button96.getText().charAt(0), button97.getText().charAt(0), button98.getText().charAt(0), button99.getText().charAt(0)},
        };
        Grid userGrid = new Grid(userGridinput);
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(userGrid.getIndexUtserGrid(i,j) == ' ') {
                    untilFinish++;
                }
            }
        }
        //solve
        //return
        if (untilFinish >= 0) {
            switch (userGrid.getErrors()) {
                case 0:
                    char[][] solutionGrid = userGrid.solveGrid();
                    //display
                    button00.setText(Character.toString(solutionGrid[0][0]));
                    button01.setText(Character.toString(solutionGrid[0][1]));
                    button02.setText(Character.toString(solutionGrid[0][2]));
                    button03.setText(Character.toString(solutionGrid[0][3]));
                    button04.setText(Character.toString(solutionGrid[0][4]));
                    button05.setText(Character.toString(solutionGrid[0][5]));
                    button06.setText(Character.toString(solutionGrid[0][6]));
                    button07.setText(Character.toString(solutionGrid[0][7]));
                    button08.setText(Character.toString(solutionGrid[0][8]));
                    button09.setText(Character.toString(solutionGrid[0][9]));
                    button10.setText(Character.toString(solutionGrid[1][0]));
                    button11.setText(Character.toString(solutionGrid[1][1]));
                    button12.setText(Character.toString(solutionGrid[1][2]));
                    button13.setText(Character.toString(solutionGrid[1][3]));
                    button14.setText(Character.toString(solutionGrid[1][4]));
                    button15.setText(Character.toString(solutionGrid[1][5]));
                    button16.setText(Character.toString(solutionGrid[1][6]));
                    button17.setText(Character.toString(solutionGrid[1][7]));
                    button18.setText(Character.toString(solutionGrid[1][8]));
                    button19.setText(Character.toString(solutionGrid[1][9]));
                    button20.setText(Character.toString(solutionGrid[2][0]));
                    button21.setText(Character.toString(solutionGrid[2][1]));
                    button22.setText(Character.toString(solutionGrid[2][2]));
                    button23.setText(Character.toString(solutionGrid[2][3]));
                    button24.setText(Character.toString(solutionGrid[2][4]));
                    button25.setText(Character.toString(solutionGrid[2][5]));
                    button26.setText(Character.toString(solutionGrid[2][6]));
                    button27.setText(Character.toString(solutionGrid[2][7]));
                    button28.setText(Character.toString(solutionGrid[2][8]));
                    button29.setText(Character.toString(solutionGrid[2][9]));
                    button30.setText(Character.toString(solutionGrid[3][0]));
                    button31.setText(Character.toString(solutionGrid[3][1]));
                    button32.setText(Character.toString(solutionGrid[3][2]));
                    button33.setText(Character.toString(solutionGrid[3][3]));
                    button34.setText(Character.toString(solutionGrid[3][4]));
                    button35.setText(Character.toString(solutionGrid[3][5]));
                    button36.setText(Character.toString(solutionGrid[3][6]));
                    button37.setText(Character.toString(solutionGrid[3][7]));
                    button38.setText(Character.toString(solutionGrid[3][8]));
                    button39.setText(Character.toString(solutionGrid[3][9]));
                    button40.setText(Character.toString(solutionGrid[4][0]));
                    button41.setText(Character.toString(solutionGrid[4][1]));
                    button42.setText(Character.toString(solutionGrid[4][2]));
                    button43.setText(Character.toString(solutionGrid[4][3]));
                    button44.setText(Character.toString(solutionGrid[4][4]));
                    button45.setText(Character.toString(solutionGrid[4][5]));
                    button46.setText(Character.toString(solutionGrid[4][6]));
                    button47.setText(Character.toString(solutionGrid[4][7]));
                    button48.setText(Character.toString(solutionGrid[4][8]));
                    button49.setText(Character.toString(solutionGrid[4][9]));
                    button50.setText(Character.toString(solutionGrid[5][0]));
                    button51.setText(Character.toString(solutionGrid[5][1]));
                    button52.setText(Character.toString(solutionGrid[5][2]));
                    button53.setText(Character.toString(solutionGrid[5][3]));
                    button54.setText(Character.toString(solutionGrid[5][4]));
                    button55.setText(Character.toString(solutionGrid[5][5]));
                    button56.setText(Character.toString(solutionGrid[5][6]));
                    button57.setText(Character.toString(solutionGrid[5][7]));
                    button58.setText(Character.toString(solutionGrid[5][8]));
                    button59.setText(Character.toString(solutionGrid[5][9]));
                    button60.setText(Character.toString(solutionGrid[6][0]));
                    button61.setText(Character.toString(solutionGrid[6][1]));
                    button62.setText(Character.toString(solutionGrid[6][2]));
                    button63.setText(Character.toString(solutionGrid[6][3]));
                    button64.setText(Character.toString(solutionGrid[6][4]));
                    button65.setText(Character.toString(solutionGrid[6][5]));
                    button66.setText(Character.toString(solutionGrid[6][6]));
                    button67.setText(Character.toString(solutionGrid[6][7]));
                    button68.setText(Character.toString(solutionGrid[6][8]));
                    button69.setText(Character.toString(solutionGrid[6][9]));
                    button70.setText(Character.toString(solutionGrid[7][0]));
                    button71.setText(Character.toString(solutionGrid[7][1]));
                    button72.setText(Character.toString(solutionGrid[7][2]));
                    button73.setText(Character.toString(solutionGrid[7][3]));
                    button74.setText(Character.toString(solutionGrid[7][4]));
                    button75.setText(Character.toString(solutionGrid[7][5]));
                    button76.setText(Character.toString(solutionGrid[7][6]));
                    button77.setText(Character.toString(solutionGrid[7][7]));
                    button78.setText(Character.toString(solutionGrid[7][8]));
                    button79.setText(Character.toString(solutionGrid[7][9]));
                    button80.setText(Character.toString(solutionGrid[8][0]));
                    button81.setText(Character.toString(solutionGrid[8][1]));
                    button82.setText(Character.toString(solutionGrid[8][2]));
                    button83.setText(Character.toString(solutionGrid[8][3]));
                    button84.setText(Character.toString(solutionGrid[8][4]));
                    button85.setText(Character.toString(solutionGrid[8][5]));
                    button86.setText(Character.toString(solutionGrid[8][6]));
                    button87.setText(Character.toString(solutionGrid[8][7]));
                    button88.setText(Character.toString(solutionGrid[8][8]));
                    button89.setText(Character.toString(solutionGrid[8][9]));
                    button90.setText(Character.toString(solutionGrid[9][0]));
                    button91.setText(Character.toString(solutionGrid[9][1]));
                    button92.setText(Character.toString(solutionGrid[9][2]));
                    button93.setText(Character.toString(solutionGrid[9][3]));
                    button94.setText(Character.toString(solutionGrid[9][4]));
                    button95.setText(Character.toString(solutionGrid[9][5]));
                    button96.setText(Character.toString(solutionGrid[9][6]));
                    button97.setText(Character.toString(solutionGrid[9][7]));
                    button98.setText(Character.toString(solutionGrid[9][8]));
                    button99.setText(Character.toString(solutionGrid[9][9]));
                    untilFinish--;
                    break;
                case 1:
                    errors.setText("Multiple Solution detected");
                    untilFinish = -1;
                    break;
                case 2:
                    errors.setText("No Solution detected");
                    untilFinish = -1;
                    break;
                default:
                    //unknow Error
                    break;
            }

        }
        errors.setTextFill(Color.GREEN);
        errors.setText("OK");
    }
}





