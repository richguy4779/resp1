package com.java;

import java.util.ArrayList;


public class Class {

  public static void main(String[] args) {


//for (int loopx=0;loopx<8;loopx++){

//for (int loop=0;loop<2;loop++){
  
//c.drawRect( x , y , w+x , h+y , paint);


ArrayList arrl2 =new ArrayList();
int a=5 ;
int b =6 ;


int sens1 = 25;
int  jk = 255/sens1;
int sk = jk;

//System.out.println(jk);



String s="";
// byte [] data=new byte[sens1];
for(int kl=0;kl<sens1;kl++){ 

   // jk=jk/2;
  arrl2.add(jk) ;
  s+=jk+"\n";
  jk+= sk ;

    
  if(jk>=255-sk){
    jk=255;
  }
  
}


System.out.println(s);

//))x=+341;
//w=+
//h=+



//System.out.println("\n");
//x=0;
//y=+ 101;







  }

}
