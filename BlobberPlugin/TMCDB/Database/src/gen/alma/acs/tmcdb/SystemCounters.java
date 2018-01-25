package alma.acs.tmcdb;
// Generated Jan 25, 2018 5:26:44 PM by Hibernate Tools 4.3.1.Final


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * SystemCounters generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name="`SYSTEMCOUNTERS`"
)
public class SystemCounters extends alma.acs.tmcdb.translator.TmcdbObject implements java.io.Serializable {


     protected Integer configurationId;
     protected HWConfiguration HWConfiguration;
     protected Long updateTime;
     protected Short autoArrayCount;
     protected Short manArrayCount;
     protected Short dataCaptureCount;

    public SystemCounters() {
    }
   
       @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="HWConfiguration"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="`CONFIGURATIONID`", unique=true, nullable=false)
    public Integer getConfigurationId() {
        return this.configurationId;
    }
    
    public void setConfigurationId(Integer configurationId) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("configurationId", this.configurationId, this.configurationId = configurationId);
        else
            this.configurationId = configurationId;
    }


@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public HWConfiguration getHWConfiguration() {
        return this.HWConfiguration;
    }
    
    public void setHWConfiguration(HWConfiguration HWConfiguration) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("HWConfiguration", this.HWConfiguration, this.HWConfiguration = HWConfiguration);
        else
            this.HWConfiguration = HWConfiguration;
    }


    
    @Column(name="`UPDATETIME`", nullable=false)
    public Long getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(Long updateTime) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("updateTime", this.updateTime, this.updateTime = updateTime);
        else
            this.updateTime = updateTime;
    }


    
    @Column(name="`AUTOARRAYCOUNT`", nullable=false)
    public Short getAutoArrayCount() {
        return this.autoArrayCount;
    }
    
    public void setAutoArrayCount(Short autoArrayCount) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("autoArrayCount", this.autoArrayCount, this.autoArrayCount = autoArrayCount);
        else
            this.autoArrayCount = autoArrayCount;
    }


    
    @Column(name="`MANARRAYCOUNT`", nullable=false)
    public Short getManArrayCount() {
        return this.manArrayCount;
    }
    
    public void setManArrayCount(Short manArrayCount) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("manArrayCount", this.manArrayCount, this.manArrayCount = manArrayCount);
        else
            this.manArrayCount = manArrayCount;
    }


    
    @Column(name="`DATACAPTURECOUNT`", nullable=false)
    public Short getDataCaptureCount() {
        return this.dataCaptureCount;
    }
    
    public void setDataCaptureCount(Short dataCaptureCount) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("dataCaptureCount", this.dataCaptureCount, this.dataCaptureCount = dataCaptureCount);
        else
            this.dataCaptureCount = dataCaptureCount;
    }





}


