package Ejercicio12.Entity;

import java.util.Date;

@SuppressWarnings("deprecation")
public class Persona {

   String nombre;
   int ano = -1, mes = -1, dia = -1;
   

   Date fecha = new Date(ano, mes, dia);
   Date fechaActual = new Date();
   
   public Persona(){
     
   }
   
   public Persona(String nombre, int ano, int mes, int dia, Date fecha) {
     this.nombre = nombre;
     this.fecha = fecha;
     this.ano = ano;
     this.mes = mes;
     this.dia = dia;
   }
   
   public String getNombre(){
     return nombre;
   }
   
   public void setNombre(String nombre){
     this.nombre = nombre;
   }
   
   public Date getFecha(){
     return fecha;
   }
   
   public void setFecha(int ano, int mes, int dia){
     fecha.setYear(ano);
     fecha.setMonth(mes);
     fecha.setDate(dia);
   }
   
   public int getAno(){
     return ano;
   }
   
   public void setAno(int ano){
     this.ano = ano;
   }
   
   public int getMes(){
     return mes;
   }
   
   public void setMes(int mes){
     this.mes = mes;
   }
   
   public int getDia(){
     return dia;
   }
   
   public void setDia(int dia){
     this.dia = dia;
   }
   
   public Date getFechaActual() {
		return fechaActual;
	}
   
}
