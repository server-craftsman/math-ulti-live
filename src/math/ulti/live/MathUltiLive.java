/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.ulti.live;

/**
 *
 * @author WINDOWS-10
 */
public class MathUltiLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Tinh giai thua");
        long result = MathUlti.getFactorial(5); //hàm tính đi coi là mấy
        System.out.println("expected: 5! = 120; actual: " + result);
        System.out.println("expected: 6! = 720; actual: " + MathUlti.getFactorial(6));
        System.out.println("expected: 0! = 1; actual: " + MathUlti.getFactorial(0));
        
        //Thêm code sau lần đầu tiên làm chuyện ấy - code lên server 1:09PM 18/5/2024
        System.out.println("expected: 1! = 1; actual: " + MathUlti.getFactorial(1));
        System.out.println("expected: 3! = 6; actual: " + MathUlti.getFactorial(3));
    }
    
}
