package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Vendor")
public class Vendor {
  @Id
  @Column
  (name="VendorID")
  private int vid;
  @Column(name="Name")
  private String vname;
  @Column(name="Domain")
  private String vdomain;
  
  public Vendor() {
	super();
  }

  public Vendor(int vid, String vname, String vdomain) {
	super();
	this.vid = vid;
	this.vname = vname;
	this.vdomain = vdomain;
  }

public int getVid() {
	return vid;
 }

 public void setVid(int vid) {
	this.vid = vid;
 }

 public String getVname() {
	return vname;
 }

 public void setVname(String vname) {
	this.vname = vname;
 }

 public String getVdomain() {
	return vdomain;
 }

 public void setVdomain(String vdomain) {
	this.vdomain = vdomain;
 }

@Override
public String toString() {
	return "Vendor [vid=" + vid + ", vname=" + vname + ", vdomain=" + vdomain + "]";
}
    
  
}
