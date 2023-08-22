
/**
 *
 * @author polan
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical2;


import java.io.Serializable;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@SuppressWarnings({"PersistenceUnitPresent", "ConsistentAccessType"})
@Access(AccessType.PROPERTY)
public class Trip implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
        private String trip_name;
        
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="CAR_ID")     
	private Cars car;
        
        
	public Trip(){
            
        }
	
	public Trip(String name) {
		this.trip_name=name;
	}
	
	public void set_name(String n){
            this.trip_name=n;
        }
	public void set_car(Cars c){
            this.car=c;
            if(!car.get_trips().contains(this)){
                car.get_trips().add(this);
            }
        }
        //getters
        
	public Cars get_car(){
            return this.car;
        }
        
        public String get_name(){
            return this.trip_name;
        }
	@Override
    public String toString() {
        return String.format("(%s)",
            this.trip_name);
    }

    
    
}

