/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cacaniquel;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import static java.lang.Thread.sleep;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author guilhermeantonelli e brunnobracioli
 */

public class Cacaniquel extends JFrame{

    boolean iniciar = false;
    int contluz = 0;
    
    
    public Cacaniquel(){
        
        newWindow();
        
        
           
        btnReset.addActionListener((ActionEvent e)->{
           if(creditos <=0){
                cpu++;
                placarCpu.setText("" + cpu);
            }
            if(creditos >= vencer){
                player++;
                placarPlayer.setText("" + player);
            }
            creditos = 75;
            pontos.setText(Integer.toString(creditos));
            iniciar = false;
            painelPerdeu.setBounds(0, 1000, 719, 701);
            painelGanhou.setBounds(0, 1000, 719, 701);
            
        });
        
        do{
             try{
                sleep(5);
            }catch(Exception ex){}
        new Thread(new Runnable(){

            @Override
            public void run() {
                new AnimarLuz().Luz();
            }
        }).start();
        
               
        if(creditos <= 0 || creditos >= vencer){
            
            btnReset.setEnabled(true);
            btnReset.setOpaque(true);
            btnReset.setBorderPainted(true);
            btnReset.setContentAreaFilled(true);
            btnReset.setText("Reset");
            if(creditos <=0)
            painelPerdeu.setBounds(0, 0, 719, 701);
            if(creditos >= vencer)
            painelGanhou.setBounds(0, 0, 719, 701);
        
        }else{
            btnReset.setEnabled(false);
            btnReset.setOpaque(false);
            btnReset.setBorderPainted(false);
            btnReset.setContentAreaFilled(false);
            btnReset.setText(null);
            
        }
        btnGirar.addActionListener((ActionEvent e) -> {
            
        if(creditos > 0 && creditos < vencer)
            pontosVencer.setText("" + vencer);
            iniciar = true;
            
        });
        if(iniciar && creditos > 0 && creditos < vencer)
        
        for(int i= 270; i<=519 ;i++){
            try{
                sleep(1);
            }catch(Exception ex){}
                img5.setBounds(519, i, 75, 75);
            }
        if(img5.getY() == 519)
            for(int i= 519; i>=280 ;i-=2){
            try{
                sleep(1);
            }catch(Exception ex){}
                img5.setBounds(519, i, 75, 75);
            }
         
        if((creditos > 0 && creditos < vencer) || iniciar == false)    
        while(iniciar){
             new Thread(new Runnable(){

            @Override
            public void run() {
               new Animar().Girar();
            }
        }).start();
            iniciar = false;
           
        }
            
        }while(true);
 
    }
    Animar teste = new Animar();
    JLabel img1 = new JLabel(new ImageIcon(getClass().getResource("teste2.jpg")));
    JLabel img2 = new JLabel(new ImageIcon(getClass().getResource("cacaniquelnovo2comluzes2.png")));
    JLabel img3 = new JLabel(new ImageIcon(getClass().getResource("teste2.jpg")));
    JLabel img4 = new JLabel(new ImageIcon(getClass().getResource("teste2.jpg")));
    JLabel img5 = new JLabel(new ImageIcon(getClass().getResource("alavanca.png")));
    JLabel fundoBranco = new JLabel(new ImageIcon(getClass().getResource("fundobranco.jpg")));
    JLabel fundoCima = new JLabel(new ImageIcon(getClass().getResource("fundobranco.jpg")));
    JLabel fundoBaixo = new JLabel(new ImageIcon(getClass().getResource("fundobranco.jpg")));
    JLabel arcoLuz = new JLabel(new ImageIcon(getClass().getResource("arcoluz.png")));
    JLabel luz = new JLabel(new ImageIcon(getClass().getResource("luz.png")));
    JLabel painelPerdeu = new JLabel(new ImageIcon(getClass().getResource("luzperdeu.png")));
    JLabel painelGanhou = new JLabel(new ImageIcon(getClass().getResource("luzganhou.png")));
    JButton btnGirar = new JButton();
    JButton btnReset = new JButton();
    int creditos = 75;
    JLabel pontos = new JLabel(Integer.toString(creditos));
    int vencer = 200;
    JLabel pontosVencer = new JLabel("" + vencer);
    int cpu = 0, player = 0;
    JLabel placarPlayer = new JLabel ("" + player);
    JLabel placarCpu = new JLabel ("" + cpu);
    int count = 500;
    int count2 = 1500;
    int count3 = 1000;
    
    
    public void newWindow(){
        setSize(719,740);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        painelGanhou.setBounds(0, 1000, 719, 701);
        painelPerdeu.setBounds(0, 1000, 719, 701);
        fundoCima.setBounds(0, 0, 701, 320);
        fundoBranco.setBounds(0, 0, 719, 701);
        fundoBaixo.setBounds(0, 0, 719, 2000);
        img1.setBounds(-150, -150, 719, 701);
        img3.setBounds(100, -150, 719, 701);
        img4.setBounds(-25, -150, 719, 701); 
        img2.setBounds(0, 0, 719, 701);
        arcoLuz.setBounds(0, 0, 719, 701);
        luz.setBounds(0, 0, 719, 701);
        btnGirar.setBounds(525, 289, 70, 70);
        img5.setBounds(519, 288, 75, 75);
        btnGirar.setOpaque(false);
        btnGirar.setContentAreaFilled(false);
        btnGirar.setFocusPainted(false);
        btnGirar.setBorderPainted(false);
        btnGirar.setBorder(new RoundedBorder(50)); //10 is the radius
        pontos.setBounds(265, 231, 150, 20);
        pontos.setFont(new Font("Verdana", Font.BOLD, 20));
        pontos.setForeground(Color.decode("#f4a142"));
        pontosVencer.setBounds(490, 231, 150, 20);
        pontosVencer.setFont(new Font("verdana", Font.BOLD, 20));
        pontosVencer.setForeground(Color.decode("#f4a142"));
        btnReset.setFont(new Font("arial", Font.BOLD, 20));
        btnReset.setBounds(480, 570, 115, 100);
        btnReset.setBackground(Color.decode("#FF0000"));
        btnReset.setEnabled(false);
        btnReset.setOpaque(false);
        btnReset.setBorderPainted(false);
        btnReset.setContentAreaFilled(false);
        btnReset.setEnabled(false);
        btnReset.setText(null);
        placarPlayer.setBounds(185, 592, 100, 100);
        placarPlayer.setFont(new Font("Verdana", Font.BOLD, 40));
        placarPlayer.setForeground(Color.decode("#f4a142"));
        placarCpu.setBounds(363, 590, 100, 100);
        placarCpu.setFont(new Font("Verdana", Font.BOLD, 40));
        placarCpu.setForeground(Color.decode("#f4a142"));
        
        
        add(luz);
        add(arcoLuz);
        add(placarCpu);
        add(placarPlayer);
        add(btnReset);   
        add(btnGirar);
        add(img5);
        add(painelGanhou);
        add(pontosVencer);
        add(painelPerdeu);
        add(pontos);
        add(img2);
        add(fundoBaixo);
        add(fundoCima);
        add(img4);
        add(img3);
        add(img1);
        add(fundoBranco);
        
 
    }
    public class AnimarLuz{
        public void Luz(){
         
           contluz++;
           
           if(contluz < 10)luz.setBounds(0, 0, 719, 701);
           if(contluz == 20)luz.setBounds(5, -41, 719, 701);
           if(contluz == 30)luz.setBounds(15, -79, 719, 701);
           if(contluz == 40)luz.setBounds(34, -116, 719, 701);
           if(contluz == 50)luz.setBounds(34, -116, 719, 701);
           if(contluz == 60)luz.setBounds(56, -147, 719, 701);
           if(contluz == 70)luz.setBounds(86, -175, 719, 701);
           if(contluz == 80)luz.setBounds(119, -194, 719, 701);
           if(contluz == 90)luz.setBounds(155, -213, 719, 701);
           if(contluz == 100)luz.setBounds(192, -225, 719, 701);
           if(contluz == 110)luz.setBounds(192, -225, 719, 701);
           if(contluz == 120)luz.setBounds(227, -230, 719, 701);
           if(contluz == 130)luz.setBounds(260, -230, 719, 701);
           if(contluz == 1400)luz.setBounds(295, -225, 719, 701);
           if(contluz == 150)luz.setBounds(331, -215, 719, 701);
           if(contluz == 160)luz.setBounds(369, -198, 719, 701);
           if(contluz == 170)luz.setBounds(398, -175, 719, 701);
           if(contluz == 180)luz.setBounds(427, -145, 719, 701);
           if(contluz == 190)luz.setBounds(449, -113, 719, 701);
           if(contluz == 200)luz.setBounds(466, -75, 719, 701);
           if(contluz == 210)luz.setBounds(478, -36, 719, 701);
           if(contluz == 220)luz.setBounds(481, 0, 719, 701);
           if(contluz >230)contluz = 0;
       }
    }
    public class Animar extends Thread{

        public void Pontos(){
            int laranja = 0, pera= -2, sete= -1, banana= -3, cereja= -4, bar= -5;
            if(count == count2 && count2 == count3){
                if(count == laranja && count2 == laranja && count3 == laranja)
                    creditos += 20;

                if(count == pera && count2 == pera && count3 == pera)
                    creditos += 40;

                if(count == banana && count2 == banana && count3 == banana)
                    creditos += 60;

                if(count == cereja && count2 == cereja && count3 == cereja)
                    creditos +=80;

                if(count == bar && count2 == bar && count3 == bar)
                    creditos +=100;

                if(count == sete && count2 == sete && count3 == sete)
                    creditos +=120;
                }
            else
                if(count==count3 || count3==count2){
                    if(count3 == laranja) // verifica a coluna do meio e compara com os outros count
                        creditos += 5;
                    if(count3 == pera)
                        creditos += 10;
                    if(count3 == banana)
                        creditos += 15;
                    if(count3 == cereja)
                        creditos += 20;
                    if(count3 == bar)
                        creditos += 25;
                    if(count3 == sete)
                        creditos += 30;
                }
                else
                    creditos -= 15;
                        
            pontos.setText(Integer.toString(creditos));
            if(creditos <= 0){
                painelPerdeu.setBounds(0, 0, 719, 701);
            }
            if(creditos >= vencer){
                painelGanhou.setBounds(0, 0, 719, 701);
            }   
            else{
                pontosVencer.setText("" + vencer);
                
            }
                
            
        }
        public void Girar(){
            count = 500;
            count2 = 1500;
            count3 = 1000;
            
            int help = 0;
            int help2 = 0;
            int help3 = 0;
            boolean girar = true;
            Random randomGenerator = new Random();
		
            while(girar){
                try{
                    sleep(5);
                }catch(Exception ex){}
                if(img1.getY() >= 20) img1.setBounds(-150, -150, 719, 701);
                if(count > 0){
                    img1.setBounds(-150, img1.getY() + 10, 719, 701);
                    count-= randomGenerator.nextInt(6) + 1;
                }
                else{                    
                    if(count == 0) help = 290;
                    if(count == -1) help = 208;
                    if(count == -2) help = 45;
                    if(count == -3) help = -55;
                    if(count == -4) help = -150;
                    if(count == -5) help = 135;
                    img1.setBounds(-150, help, 719, 701);
                }
                
                if(img3.getY() >= 20) img3.setBounds(100, -150, 719, 701);
                if(count2 > 0){
                    img3.setBounds(100, img3.getY() + 10, 719, 701);
                    count2-= randomGenerator.nextInt(6) + 1;
                }
                 else{
                    if(count2 == 0) help2 = 290;
                    if(count2 == -1) help2 = 208;
                    if(count2 == -2) help2 = 45;
                    if(count2 == -3) help2 = -55;
                    if(count2 == -4) help2 = -150;
                    if(count2 == -5) help2 = 135;
                    img3.setBounds(100, help2, 719, 701);
                    girar = false;
                }
                
          
               
                if(img4.getY() >= 20) img4.setBounds(-25, -150, 719, 701);
                if(count3 > 0){
                    img4.setBounds(-25, img4.getY() + 10, 719, 701);
                    count3-= randomGenerator.nextInt(6) + 1;
                }
                 else{
                    if(count3 == 0) help3 = 290;
                    if(count3 == -1) help3 = 208;
                    if(count3 == -2) help3 = 45;
                    if(count3 == -3) help3 = -55;
                    if(count3 == -4) help3 = -150;
                    if(count3 == -5) help3 = 135;
                    img4.setBounds(-25, help3, 719, 701);
                }
                System.out.println(count + " " + count2 + " " + count3);
            }
            Pontos();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       new Cacaniquel();
    }
    
}
