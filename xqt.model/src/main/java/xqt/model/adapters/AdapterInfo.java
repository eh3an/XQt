/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package xqt.model.adapters;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author standard
 */
@XmlRootElement(name="Adapter")
public class AdapterInfo {

    private String id;
    private String location;
    private String locationType;
    private String mainClassName;
    private String mainNamespace;
    
    public AdapterInfo(){
        
    }

    public AdapterInfo(String id, String location, String locationType, String mainClassName, String mainNamespace){
        this.id = id;
        this.location = location;
        this.locationType = locationType;
        this.mainClassName = mainClassName;
        this.mainNamespace = mainNamespace;
    }

    @XmlElement(name="Id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement(name="Location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @XmlElement(name="LocationType")
    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    @XmlElement(name="ClassName")
    public String getMainClassName() {
        return mainClassName;
    }

    public void setMainClassName(String mainClassName) {
        this.mainClassName = mainClassName;
    }

    @XmlElement(name="Namespace")
    public String getMainNamespace() {
        return mainNamespace;
    }

    public void setMainNamespace(String mainNamespace) {
        this.mainNamespace = mainNamespace;
    }
        
}