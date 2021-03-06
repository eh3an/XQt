/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xqt.model.containers;

import xqt.model.declarations.PerspectiveDescriptor;

/**
 *
 * @author Javad Chamanara <chamanara@gmail.com>
 */
public class VariableContainer extends DataContainer{
    protected String variableName;
    protected PerspectiveDescriptor perspective;
    
    public VariableContainer(){
        this.dataContainerType = DataContainerType.Variable;
    }

    public VariableContainer(String variableName){
        this();
        setVariableName(variableName);
    }
        
    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
        if(dataContainerType == DataContainerType.Variable || dataContainerType == DataContainerType.Plot)
            this.id = variableName;
    }     

    public PerspectiveDescriptor getPerspective() {
        return perspective;
    }

    public void setPerspective(PerspectiveDescriptor perspective) {
        this.perspective = perspective;
    }
}
