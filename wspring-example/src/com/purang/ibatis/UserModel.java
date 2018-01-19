package com.purang.ibatis;

public class UserModel {

	  private int id;
	  private String name;
	    
	    public void setId(int id) {
	        this.id = id;
	    }
	    public int getId() {
	        return id;
	    }
	    public void setName(String myName) {
	        this.name = myName;
	    }
	    public String getName() {
	        return name;
	    }
	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + id;
	        return result;
	    }
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        UserModel other = (UserModel) obj;
	        if (id != other.id)
	            return false;
	        return true;
	    }
	    
	
}
