/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author polan
 */
@Entity

@SuppressWarnings({"PersistenceUnitPresent", "ConsistentAccessType", "IdDefinedInHierarchy"})
public class Cars implements Serializable{
	private static final long serialVersionUID = 1L;
	//@Access(AccessType.FIELD)
	@Id
        @Column(name="CAR_ID")
	private String car_name;
        
        
	private List<Trip> car_trips;
	
	public Cars(){
            car_trips=new ArrayList();
        }
	
	public Cars(String n) {
                car_trips=new ArrayList();
		this.car_name=n;		
	}
	
	public void set_name(String n) {
		this.car_name=n;
	}
	
	public void add_trip(Trip n) {
		this.car_trips.add(n);
                if(n.get_car()!=this){
                    n.set_car(this);
                }
	}
	
        //getters
        
        public String get_name() {
		return this.car_name;
	}
	
        @OneToMany(targetEntity=Trip.class, mappedBy="car", cascade=CascadeType.ALL, fetch=FetchType.LAZY,orphanRemoval=true)
	public List<Trip> get_trips(){
            return this.car_trips;
        }
        
	@Override
    public String toString() {
        return String.format("(%s,%s)",
            this.car_name,this.get_trips());
    }
}
