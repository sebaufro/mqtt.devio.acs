package alma.acs.tmcdb;
// Generated Jan 25, 2018 5:26:44 PM by Hibernate Tools 4.3.1.Final


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FocusModelCoeffOffsetId generated by hbm2java
 */
@SuppressWarnings("serial")
@Embeddable
public class FocusModelCoeffOffsetId  implements java.io.Serializable {


     private Integer focusModelCoeffId;
     private AntennaFMCoeffOffBand receiverBand;

    public FocusModelCoeffOffsetId() {
    }
   


    @Column(name="`FOCUSMODELCOEFFID`", nullable=false)
    public Integer getFocusModelCoeffId() {
        return this.focusModelCoeffId;
    }
    
    public void setFocusModelCoeffId(Integer focusModelCoeffId) {    
    	this.focusModelCoeffId = focusModelCoeffId;
    }



    @Column(name="`RECEIVERBAND`", nullable=false, length=128)
    public AntennaFMCoeffOffBand getReceiverBand() {
        return this.receiverBand;
    }
    
    public void setReceiverBand(AntennaFMCoeffOffBand receiverBand) {    
    	this.receiverBand = receiverBand;
    }



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof FocusModelCoeffOffsetId) ) return false;
		 FocusModelCoeffOffsetId castOther = ( FocusModelCoeffOffsetId ) other;

		 return ( (this.getFocusModelCoeffId()==castOther.getFocusModelCoeffId()) || ( this.getFocusModelCoeffId()!=null && castOther.getFocusModelCoeffId()!=null && this.getFocusModelCoeffId().equals(castOther.getFocusModelCoeffId()) ) )
 && ( (this.getReceiverBand()==castOther.getReceiverBand()) || ( this.getReceiverBand()!=null && castOther.getReceiverBand()!=null && this.getReceiverBand().equals(castOther.getReceiverBand()) ) );
   }

   public int hashCode() {
         int result = 17;

         result = 37 * result + ( getFocusModelCoeffId() == null ? 0 : this.getFocusModelCoeffId().hashCode() );
         result = 37 * result + ( getReceiverBand() == null ? 0 : this.getReceiverBand().hashCode() );
         return result;
   }


}


