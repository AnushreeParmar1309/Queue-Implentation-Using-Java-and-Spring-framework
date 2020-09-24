/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SECProject;

/**
 *
 * @author anush
 */
public class User {
    public int id;
        public String name;
        public String email;
        public String status;
        
        public User(int id, String name, String email)
        {
            this.id=id;
            this.name=name;
            this.email=email;
            this.status="Queued";
                   
        }
    
}
