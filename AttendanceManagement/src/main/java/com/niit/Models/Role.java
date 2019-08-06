package com.niit.Models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Role 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int roleID;
	private String roleName;	
	private String roleDesc;
	public int getRoleID() {
		return roleID;
	}
	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDesc() {
		return roleDesc;
	}
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	
	@Override
	public String toString() {
		return "Role [roleID=" + roleID + ", roleName=" + roleName + ", roleDesc=" + roleDesc + "]";
	}
	
	
}
