
public class PartidoTennis {
    public static void main(String[] args) {
        String p1jugador = "Love";
        String p2jugador = "Love";
        String []secuencia ={"p1", "p1", "p2", "p2", "p1", "p2", "p1", "p1"};

        for(int i =0; i < secuencia.length;i++){
            if(secuencia[i].equals("p1") ){
                if(p1jugador.equalsIgnoreCase("Love")){
                    p1jugador = "15";
                    System.out.println(p1jugador + "-" + p2jugador);
                }else if(p1jugador.equalsIgnoreCase("15")){
                    p1jugador = "30";
                    System.out.println(p1jugador + "-" + p2jugador);
                }else if(p1jugador.equalsIgnoreCase("30")){
                    p1jugador = "40";
                    System.out.println(p1jugador + "-" + p2jugador);
                }
            }

            if(secuencia[i].equals("p2") ){
                if(p2jugador.equalsIgnoreCase("Love")){
                    p2jugador = "15";
                    System.out.println(p1jugador + "-" + p2jugador);
                }else if(p2jugador.equalsIgnoreCase("15")){
                    p2jugador = "30";
                    System.out.println(p1jugador + "-" + p2jugador);
                }else if(p2jugador.equalsIgnoreCase("30")){
                    p2jugador = "40";
                    System.out.println(p1jugador + "-" + p2jugador);
                }
            }

            if(p1jugador.equals("40") && p2jugador.equals("40")){
                System.out.println("Deuce");
                i++;

                if(secuencia[i].equalsIgnoreCase("p1")){
                    p1jugador = "Ventaja p1";
                    System.out.println(p1jugador);
                    if(secuencia[i].equalsIgnoreCase("p1") && p1jugador.equalsIgnoreCase("Ventaja p1")){
                        System.out.println("Ha ganado el juagdor P1");
                    }
                }else if(secuencia[i].equalsIgnoreCase("p2")){
                    p2jugador = "Ventaja p2";
                    System.out.println(p2jugador);
                    if(secuencia[i].equalsIgnoreCase("p2") && p2jugador.equalsIgnoreCase("Ventaja p2")){
                        System.out.println("Ha ganado el juagdor P2");
                    }
                }

            }
        }
    }
}
