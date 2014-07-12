/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package xqt.model.execution;

import com.vaiona.commons.compilation.InMemorySourceFile;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import xqt.model.adapters.DataAdapter;
import xqt.model.data.Variable;
import xqt.model.statements.StatementDescriptor;

/**
 *
 * @author standard
 */
public class ExecutionInfo {
    private StatementDescriptor statement;
    private Variable variable = null;
    private Boolean isExecuted = false;
    // add diagnostics here, start time, stop time, etc
    private List<String> issues = new ArrayList<>();
    private DataAdapter adapter = null;
    LinkedHashMap<String, InMemorySourceFile> sources = new LinkedHashMap<>();

    public LinkedHashMap<String, InMemorySourceFile> getSources(){
        return sources;
    }

    public void setSources(LinkedHashMap<String, InMemorySourceFile> sources){
        this.sources = sources;
    } 
    
    public DataAdapter getAdapter() {
        return adapter;
    }

    public void setAdapter(DataAdapter adapter) {
        this.adapter = adapter;
    }

    public Boolean isIsExecuted() {
        return isExecuted;
    }

    public void setIsExecuted(Boolean isExecuted) {
        this.isExecuted = isExecuted;
    }

    public StatementDescriptor getStatement() {
        return statement;
    }

    public void setStatement(StatementDescriptor statement) {
        this.statement = statement;
    }

    public Boolean hasVariable() {
        return variable != null;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public Boolean isExecuted() {
        return isExecuted;
    }

    public void setExecuted(Boolean isExecuted) {
        this.isExecuted = isExecuted;
    }

    public List<String> getIssues() {
        return issues;
    }

    public void setIssues(List<String> issues) {
        this.issues = issues;
    }        

}
