<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 01.10.19
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Flexible List Admin Page</title>
    <style>
        table, th, td {
            border: 1px solid red
        }
    </style>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
</head>
<body>

    <h1>Flexible List Administration</h1>

    List: <select id="flexible-list">

    </select>

    <h2>Flexible List Items</h2>

<table id="flexible-list-items">

    <tr>
        <th>ID</th>
        <th>Value ID</th>
        <th>Value Name</th>
        <th>X Int 1</th>
        <th>X Int 2</th>
        <th>X Dec 1</th>
        <th>X Dec 2</th>
        <th>X Str 1</th>
        <th>X Str 2</th>
        <th>Insert Date</th>
        <th>Last Update</th>
        <th>Action</th>
    </tr>
</table>

    <div id="flexible-list-item-div" style="display: none">
        ID: <span id="item_id"></span> <br/>
        Value ID: <span id="value_id"></span><br/>
        Value Name: <span id="value_name"></span><br/>
        X Int1: <span id="xi1"></span><br/>
        X Int2: <span id="xi2"></span><br/>
        X Dec 1: <span id="xd1"></span><br/>
        X Dec 2: <span id="xd2"></span><br/>
        X Str 1: <span id="xs1"></span><br/>
        X Str 2: <span id="xs2"></span><br/>
        Insert date: <span id="insert_date"></span><br/>
        Last Update: <span id="last_update"></span><br/>
    </div>

    <div id="update-flexible-list-item-div" style="display: none">
        <form>
            ID: <input type="number" id="upd_item_id" /> <br/>
            Value ID: <input type="number" id="upd_value_id" /> <br/>
            Value Name: <input type="text" id="upd_value_name" /> <br/>
            X Int1: <input type="number" id="upd_xi1" /> <br/>
            X Int2: <input type="number" id="upd_xi2" /> <br/>
            X Int3: <input type="number" id="upd_xi3" /> <br/>
            X Int4: <input type="number" id="upd_xi4" /> <br/>
            X Int5: <input type="number" id="upd_xi5" /> <br/>
            X Int6: <input type="number" id="upd_xi6" /> <br/>
            X Dec1: <input type="number" id="upd_xd1" step="0.01"/> <br/>
            X Dec2: <input type="number" id="upd_xd2" step="0.01"/> <br/>
            X Str1: <input type="text" id="upd_xs1" /> <br/>
            X Str2: <input type="text" id="upd_xs2" /> <br/>
            Insert date: <input type="text" id="upd_insert_date"/> <br/>
            Last update: <input type="text" id="upd_last_update"/> <br/>
        </form>
    </div>
</body>

<script src="https://code.jquery.com/jquery-3.4.1.min.js" type="text/javascript"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<script>

    var baseUrl = 'http://localhost:8080/rest/flexible-list';

    function get_flexible_list() {
        $.ajax({
            url: baseUrl + '/',
            method: 'GET',
            success: function (data) {
                console.log(data);

                $('#flexible-list').empty();

                for (var i = 0; i < data.length; i++) {
                    $('#flexible-list').append("<option value=" + data[i].id +
                        ">" + data[i].name + "</option>");
                }

                $('#flexible-list').change();
            }
        });
    }

    function clear_table() {
        $('#flexible-list-items').empty();

        $('#flexible-list-items').append(" <tr>\n" +
            "        <th>ID</th>\n" +
            "        <th>Value ID</th>\n" +
            "        <th>Value Name</th>\n" +
            "        <th>X Int 1</th>\n" +
            "        <th>X Int 2</th>\n" +
            "        <th>X Int 3</th>\n" +
            "        <th>X Int 4</th>\n" +
            "        <th>X Int 5</th>\n" +
            "        <th>X Int 6</th>\n" +
            "        <th>X Dec 1</th>\n" +
            "        <th>X Dec 2</th>\n" +
            "        <th>X Str 1</th>\n" +
            "        <th>X Str 2</th>\n" +
            "        <th>Insert Date</th>\n" +
            "        <th>Last Update</th>\n" +
            "        <th>Action</th>\n" +
            "    </tr>");
    }

    function get_extra_value(extra_column, key) {
        if(key in extra_column) {
            return extra_column[key];
        } else {
            return '';
        }
    }

    function add_flexible_list_item(flexible_list_item) {
        $('#flexible-list-items').append("<tr>\n" +
            "        <th>" + flexible_list_item.id + "</th>\n" +
            "        <th>" + flexible_list_item.valueId + "</th>\n" +
            "        <th>" + flexible_list_item.valueName + "</th>\n" +
            "        <th>" + get_extra_value(flexible_list_item.extraColumnInteger, 1) + "</th>\n" +
            "        <th>" + get_extra_value(flexible_list_item.extraColumnInteger, 2) + "</th>\n" +
            "        <th>" + get_extra_value(flexible_list_item.extraColumnInteger, 3) + "</th>\n" +
            "        <th>" + get_extra_value(flexible_list_item.extraColumnInteger, 4) + "</th>\n" +
            "        <th>" + get_extra_value(flexible_list_item.extraColumnInteger, 5) + "</th>\n" +
            "        <th>" + get_extra_value(flexible_list_item.extraColumnInteger, 6) + "</th>\n" +
            "        <th>" + get_extra_value(flexible_list_item.extraColumnDecimal, 1) + "</th>\n" +
            "        <th>" + get_extra_value(flexible_list_item.extraColumnDecimal, 2) + "</th>\n" +
            "        <th>" + get_extra_value(flexible_list_item.extraColumnString, 1) + "</th>\n" +
            "        <th>" + get_extra_value(flexible_list_item.extraColumnString, 2) + "</th>\n" +
            "        <th>" + flexible_list_item.insertDate + "</th>\n" +
            "        <th>" + flexible_list_item.lastUpdate + "</th>\n" +
            "        <th>" +
            "               <a href='#' onclick='view_flexible_list_item(" +  flexible_list_item.id + ")'>View</a>" +
            "               <a href='#' onclick='edit_flexible_list_item(" +  flexible_list_item.id + ")'>Edit</a>" +
            "               <a href='#' onclick='delete_flexible_list_item(" +  flexible_list_item.id + ")'>Delete</a>" +
            "           </th>\n" +
            "    </tr>");
    }

    function view_flexible_list_item(itemId) {
        console.log('view flexible list item id = ' + itemId);

        $.ajax({
            url: baseUrl + '/item/' + itemId,
            method: 'GET',
            success: function(data) {
                $('#item_id').html(data.id);
                $('#value_id').html(data.valueId);
                $('#value_name').html(data.valueName);
                $('#xi1').html(get_extra_value(data.extraColumnInteger, 1));
                $('#xi2').html(get_extra_value(data.extraColumnInteger, 2));
                $('#xd1').html(get_extra_value(data.extraColumnDecimal, 1));
                $('#xd2').html(get_extra_value(data.extraColumnDecimal, 2));
                $('#xs1').html(get_extra_value(data.extraColumnString, 1));
                $('#xs2').html(get_extra_value(data.extraColumnString, 2));
                $('#insert_date').html(data.insertDate);
                $('#last_update').html(data.lastUpdate);
                // $('#flexible-list-item-div').show();
                $('#flexible-list-item-div').dialog( "open" );
            }
        });
    }

    function edit_flexible_list_item(itemId) {
        console.log('edit flexible list item ' + itemId);

        $.ajax({
            url: baseUrl + "/item/" + itemId,
            method: 'GET',
            success: function(data) {
                $('#upd_item_id').val(data.id);
                $('#upd_value_id').val(data.valueId);
                $('#upd_value_name').val(data.valueName);
                $('#upd_xi1').val(get_extra_value(data.extraColumnInteger, 1));
                $('#upd_xi2').val(get_extra_value(data.extraColumnInteger, 2));
                $('#upd_xi3').val(get_extra_value(data.extraColumnInteger, 3));
                $('#upd_xi4').val(get_extra_value(data.extraColumnInteger, 4));
                $('#upd_xi5').val(get_extra_value(data.extraColumnInteger, 5));
                $('#upd_xi6').val(get_extra_value(data.extraColumnInteger, 6));
                $('#upd_xd1').val(get_extra_value(data.extraColumnDecimal, 1));
                $('#upd_xd2').val(get_extra_value(data.extraColumnDecimal, 2));
                $('#upd_xs1').val(get_extra_value(data.extraColumnString, 1));
                $('#upd_xs2').val(get_extra_value(data.extraColumnString, 2));
                $('#upd_insert_date').val(data.insertDate);
                $('#upd_last_update').val(data.lastUpdate);
                $('#update-flexible-list-item-div').dialog('open');
            }
        });
    }

    function delete_flexible_list_item(itemId) {
        if(confirm("Silmek istediyinize eminsiniz?")) {
            $.ajax({
                url: baseUrl + "/item/" + itemId,
                method: 'DELETE',
                success: function (data) {
                    $('#flexible-list').change();
                },
                error: function (data, textStatus, errorThrown) {
                    alert(textStatus + ' ' + errorThrown);
                }
            });
        }
    }

    function setup_dialog() {
        var dialog = $('#flexible-list-item-div').dialog({
            autoOpen: false,
            height: 400,
            width: 350,
            modal: true
        });

        $('#update-flexible-list-item-div').dialog({
            autoOpen: false,
            height: 500,
            width: 450,
            modal: true,
            buttons: {
                "Save": function() {
                    // formdan datani oxu
                    // validate ele
                    // error yoxdursa, ajax PUT request
                    // error varsa, goster

                    var item = {
                        "id": $('#upd_item_id').val(),
                        "listId": $('#flexible-list').val(),
                        "valueId": $('#upd_value_id').val(),
                        "valueName": $('#upd_value_name').val(),
                        "extraColumnInteger": {},
                        "extraColumnDecimal": {},
                        "extraColumnString": {}
                    };

                    if($('#upd_xi1').val().length > 0) {
                        item.extraColumnInteger['1'] = $('#upd_xi1').val();
                    }

                    if($('#upd_xi2').val().length > 0) {
                        item.extraColumnInteger['2'] = $('#upd_xi2').val();
                    }

                    if($('#upd_xi3').val().length > 0) {
                        item.extraColumnInteger['3'] = $('#upd_xi3').val();
                    }

                    if($('#upd_xi4').val().length > 0) {
                        item.extraColumnInteger['4'] = $('#upd_xi4').val();
                    }

                    if($('#upd_xi5').val().length > 0) {
                        item.extraColumnInteger['5'] = $('#upd_xi5').val();
                    }

                    if($('#upd_xi6').val().length > 0) {
                        item.extraColumnInteger['6'] = $('#upd_xi6').val();
                    }

                    if($('#upd_xd1').val().length > 0) {
                        item.extraColumnDecimal['1'] = $('#upd_xd1').val();
                    }

                    if($('#upd_xd2').val().length > 0) {
                        item.extraColumnDecimal['2'] = $('#upd_xd2').val();
                    }

                    if($('#upd_xs1').val().length > 0) {
                        item.extraColumnString['1'] = $('#upd_xs1').val();
                    }

                    if($('#upd_xs2').val().length > 0) {
                        item.extraColumnString['2'] = $('#upd_xs2').val();
                    }


                    var json = JSON.stringify(item);
                    console.log('json data = ' + json);

                    $.ajax({
                        url: baseUrl + "/item",
                        contentType: 'application/json',
                        method: 'PUT',
                        data: json,



                        success: function(data, textStatus) {
                            $('#flexible-list').change();
                            $('#update-flexible-list-item-div').dialog('close');
                        },
                        error: function(jqXHR, textStatus, errorThrown) {
                            alert(textStatus + ' ' + errorThrown);
                            $('#update-flexible-list-item-div').dialog('close');
                        }
                    });
                },
                "Cancel": function () {
                    $('#update-flexible-list-item-div').dialog('close');
                }
            }
        });
    }

    $(document).ready(function () {
        console.log('page init');

        setup_dialog();

        get_flexible_list();

        $('#flexible-list').on('change', function() {
            var listId = $('#flexible-list').val();
            var listName = $('#flexible-list option:selected').text();
            console.log('selected list id = ' + listId + ' name = ' + listName);

            $.ajax({
                url: baseUrl + '/' + listId,
                method: 'GET',
                success: function (data) {
                    clear_table();
                    for (var i = 0; i < data.length; i++) {
                        add_flexible_list_item(data[i]);
                    }
                }
            });
        });
    });
</script>


</html>
