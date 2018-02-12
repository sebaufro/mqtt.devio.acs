package alma.acs.tmcdb;
// Generated Jan 25, 2018 5:26:44 PM by Hibernate Tools 4.3.1.Final


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BL_AntennaToPadId generated by hbm2java
 */
@SuppressWarnings("serial")
@Embeddable
public class BL_AntennaToPadId  implements java.io.Serializable {


     private Integer version;
     private Long modTime;
     private Character operation;
     private Integer antennaToPadId;

    public BL_AntennaToPadId() {
    }
   


    @Column(name="`VERSION`", nullable=false)
    public Integer getVersion() {
        return this.version;
    }
    
    public void setVersion(Integer version) {    
    	this.version = version;
    }



    @Column(name="`MODTIME`", nullable=false)
    public Long getModTime() {
        return this.modTime;
    }
    
    public void setModTime(Long modTime) {    
    	this.modTime = modTime;
    }



    @Column(name="`OPERATION`", nullable=false, length=1)
    public Character getOperation() {
        return this.operation;
    }
    
    public void setOperation(Character operation) {    
    	this.operation = operation;
    }



    @Column(name="`ANTENNATOPADID`", nullable=false)
    public Integer getAntennaToPadId() {
        return this.antennaToPadId;
    }
    
    public void setAntennaToPadId(Integer antennaToPadId) {    
    	this.antennaToPadId = antennaToPadId;
    }



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof BL_AntennaToPadId) ) return false;
		 BL_AntennaToPadId castOther = ( BL_AntennaToPadId ) other;

		 return ( (this.getVersion()==castOther.getVersion()) || ( this.getVersion()!=null && castOther.getVersion()!=null && this.getVersion().equals(castOther.getVersion()) ) )
 && ( (this.getModTime()==castOther.getModTime()) || ( this.getModTime()!=null && castOther.getModTime()!=null && this.getModTime().equals(castOther.getModTime()) ) )
 && ( (this.getOperation()==castOther.getOperation()) || ( this.getOperation()!=null && castOther.getOperation()!=null && this.getOperation().equals(castOther.getOperation()) ) )
 && ( (this.getAntennaToPadId()==castOther.getAntennaToPadId()) || ( this.getAntennaToPadId()!=null && castOther.getAntennaToPadId()!=null && this.getAntennaToPadId().equals(castOther.getAntennaToPadId()) ) );
   }

   public int hashCode() {
         int result = 17;

         result = 37 * result + ( getVersion() == null ? 0 : this.getVersion().hashCode() );
         result = 37 * result + ( getModTime() == null ? 0 : this.getModTime().hashCode() );
         result = 37 * result + ( getOperation() == null ? 0 : this.getOperation().hashCode() );
         result = 37 * result + ( getAntennaToPadId() == null ? 0 : this.getAntennaToPadId().hashCode() );
         return result;
   }


}

