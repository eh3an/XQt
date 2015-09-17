/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package xqt.model.statements.query;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import xqt.model.ClauseDescriptor;

/**
 *
 * @author Javad Chamanara
 * @project SciQuest
 */
public class GroupClause extends ClauseDescriptor{
    private Map<String, GroupEntry> groupIds = new LinkedHashMap<>();

    public GroupClause(){
        id = UUID.randomUUID().toString();
        type = SelectClauseType.Group.toString();
    }

    public Map<String, GroupEntry> getGroupIds() {
        return groupIds;
    }

    public void setGroupIds(Map<String, GroupEntry> groupIds) {
        this.groupIds = groupIds;
        //isPresent = groupIds != null && groupIds.size() > 0;
    }


}
