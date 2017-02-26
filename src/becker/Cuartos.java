/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;
import becker.robots.*;
/**
 *
 * @author Estudiante
 */
public class Cuartos {
    private City gotham;
    private Thing seg;
    private Robot bats;
    
public Cuartos(){
    this.gotham = new City (11, 11);
    this.bats = new Robot(gotham,6,2,Direction.NORTH);    
    for (int i=1; i <0; i++){
        for (int y = 1; y < 0; y++){
    this.seg = new Thing (this.gotham,y, i);
    }
    }
    for (int w= 1; w < 6; w++){
    Wall one = new Wall (gotham, w, 1, Direction.WEST );
    }
    for (int e=1;e < 6; e++){
        Wall two = new Wall (gotham, e, 9, Direction.EAST);
    }
    for (int n=1; n< 10; n++){
        Wall three = new Wall(gotham, 1, n, Direction.NORTH);
    }
    //copiado y modificado del codigo de @leotalorac
     Wall p1 = new Wall(gotham,5,1,Direction.SOUTH);   
     Wall p2 = new Wall(gotham,5,3,Direction.SOUTH);   
     Wall p3 = new Wall(gotham,5,4,Direction.SOUTH);   
     Wall p4 = new Wall(gotham,5,6,Direction.SOUTH);   
     Wall p5 = new Wall(gotham,5,7,Direction.SOUTH);   
     Wall p6 = new Wall(gotham,5,9,Direction.SOUTH);
     //fin de la copia.
    for (int i1=1; i1 < 6; i1++){
        Wall five = new Wall(gotham, i1, 4, Direction.WEST);
    }
    for (int i2=1; i2 < 6; i2++){
        Wall six = new Wall(gotham, i2, 7, Direction.WEST);
    }
}
public void movimiento (){
    boolean a,b,c,d,e,f,g = false;
    // inicia.
    bats.move();
    bats.turnLeft();
    bats.move();
    for (int i = 0; i < 2; i++){
        bats.turnLeft();
    }
    //Reconocer movimientos.
    bats.move();
    if (this.bats.canPickThing()){
            bats.pickThing();
            bats.putThing();
            d = true;
            } else {
        d = false;
    }
    bats.move();
    bats.turnLeft();
    bats.move();
    if (this.bats.canPickThing()){
            bats.pickThing();
            bats.putThing();
            c = true;
            } else {
        c = false;
    }
    bats.move();
    bats.move();
    if (this.bats.canPickThing()){
            bats.pickThing();
            bats.putThing();
            b = true;
            } else {
        b = false;
    }
    bats.move();
    bats.turnLeft();
    bats.move();
    if (this.bats.canPickThing()){
            bats.pickThing();
            bats.putThing();
            a = true;
            } else {
        a = false;
    }
    bats.move();
    bats.turnLeft();
    bats.move();
    if (this.bats.canPickThing()){
            bats.pickThing();
            bats.putThing();
            f = true;
            } else {
        f = false;
    }
    bats.move();
    bats.turnLeft();
    bats.move();
    if (this.bats.canPickThing()){
            bats.pickThing();
            bats.putThing();
            g = true;
            } else {
        g = false;
    }
    for(int i = 0; i < 2; i++){
        bats.turnLeft();
    }
    bats.move();
    bats.turnLeft();
    bats.move();
    if (this.bats.canPickThing()){
            bats.pickThing();
            bats.putThing();
            e = true;
            } else {
        e = false;
    }
    bats.move();    
    bats.turnLeft();
    bats.move();
    for (int i = 0; i < 3; i++){
    bats.turnLeft();
    }
    bats.move();
    if (d = true){
        if (c = true){
            if (b = true ){
                if (a = true ){
                    if(f = true){
                        if (g = true){
                            if ( e = true){
                                System.out.println("8");
                            }
                        }
                    }
                }
            }
        }
    }
}

}
