/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

public class Car  {
	
	
	
	private String car_reg;
	private String car_make;
	private String car_model;
	private String car_year;
	private double car_speed;
	
	public Car(){}
	
	public Car(String reg,String make,String model,String year,double speed) {
		
			this.car_reg=reg;
			this.car_make=make;
			this.car_model=model;
			this.car_speed=speed;
			this.car_year=year;
	}
	
	public void set_reg(String r) {
		this.car_reg=r;
	}
	
	public void set_make(String m) {
		this.car_make=m;
	}
	public void set_model(String m) {
		this.car_model=m;
	}
	public void set_year(String y) {
		this.car_year=y;
	}
	public void set_speed(double s) {
		this.car_speed=s;
	}
        
        //getters
        
        public String gt_reg() {
		return this.car_reg;
	}
	
	public String get_make() {
		return this.car_make;
	}
	public String get_model() {
		return this.car_model;
	}
	public String get_year(String y) {
		return this.car_year;
	}
	public double get_speed(String s) {
		return this.car_speed;
	}
	
	
	@Override
    public String toString() {
        return String.format("(%s, %s, %s, %s, %s)",
            this.car_reg, this.car_make,this.car_model,this.car_year,this.car_speed);
    }
}
