����   @ <
      java/lang/Object <init> ()V	  	 
   java/lang/System out Ljava/io/PrintStream;  0Nivel %d,  poder: %d, conhecimento: %d, vida: %d
      java/lang/Integer valueOf (I)Ljava/lang/Integer;
      java/io/PrintStream format <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;   
      println (Ljava/lang/String;)V " java/util/Random
 ! 
 ! % & ' nextInt (I)I ) rpg/PersonagemAcao Code LineNumberTable LocalVariableTable this Lrpg/PersonagemAcao; mostrarStatus nivel I conhecimento poder vida calcularDano ()I gerador Ljava/util/Random; dado20Faces 
SourceFile PersonagemAcao.java ! (           *   /     *� �    +        ,        - .    /   *   �     <;<=
>� � Y� SY� SY� SY� S� W� � �    +       	  
     
  3  ;  ,   *   : 0 1    7 2 1   5 3 1  
 2 4 1    5 6  *   Y     � !Y� #L+� $`=�    +            ,         - .     7 8    9 1   :    ;