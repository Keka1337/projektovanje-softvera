/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jelena
 */
public interface GenericEntity extends Serializable {

    String getTableName();

    String getColumnNamesForInsert();

    String getInsertValues();

    String getColumnNamesValuesUpdate();

    String getWhereClauseDeleteEdit();

    String getColumnNamesForGetAll();

    String getJoinClause();

    String getWhereForGetAll();

    String getOrderByClause();

    void setId(Long id);

}
