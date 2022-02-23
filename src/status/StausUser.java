/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm Exam
 * @author srinivsi
 */
public class StausUser 
{
    enum Status{
        ZERO("REJECTED"),
        ONE("PENDING"),
        TWO("PROCESSING"),
        THREE("APPROVED");

        public final String code;

        private Status(String code){
            this.code = code;
        }
    }
    public void statusDetail(String code)
    {
        code = code.toUpperCase();
        System.out.println(Status.valueOf(code));
    }
}
