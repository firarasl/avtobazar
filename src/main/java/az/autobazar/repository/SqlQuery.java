package az.autobazar.repository;

public class SqlQuery {

    /* public static final String GET_AUTO_LIST = "select a.id, a.year, a.price, a.create_date, m.file_name AS media, \n" +
                "             m.id as main_media_id, \n" +
                "               flbi.value_id as brand_id, flbi.value_name AS brand_name, \n" +
                "               flmi.value_id as model_id, flmi.value_name model_name, \n" +
                "               flci.value_id as currency_id, flci.value_name AS currency_name \n" +
                "            from auto a JOIN media m ON a.id = m.auto_id and m.main = 1 and m.status = 1 \n" +
                "                join flexible_list_item flci on a.currency_id = flci.value_id and flci.status = 1 \n" +
                "                join flexible_list flc on flc.id = flci.list_id and flc.name = 'currency' \n" +
                "                join flexible_list_item flmi on a.model_id = flmi.value_id and flmi.status = 1 \n" +
                "                join flexible_list flm on flm.id = flmi.list_id and flm.name = 'model' \n" +
                "                join flexible_list_item flbi on flmi.ec_int2 = flbi.value_id and flbi.status = 1 \n" +
                "                join flexible_list flb on flb.id = flbi.list_id and flb.name = 'brand' and flb.status = 1 \n" +
                "            where a.status = 1 " +
                "            ORDER BY a.id";



        public static final String GET_AUTO_BY_ID = "select a.id, a.year, a.price, a.create_date, m.file_name AS media, \n" +
                "             m.id as main_media_id, \n" +
                "               flbi.value_id as brand_id, flbi.value_name AS brand_name, \n" +
                "               flmi.value_id as model_id, flmi.value_name model_name, \n" +
                "               flci.value_id as currency_id, flci.value_name AS currency_name \n" +
                "            from auto a JOIN media m ON a.id = m.auto_id and m.main = 1 and m.status = 1 \n" +
                "                join flexible_list_item flci on a.currency_id = flci.value_id and flci.status = 1 \n" +
                "                join flexible_list flc on flc.id = flci.list_id and flc.name = 'currency' \n" +
                "                join flexible_list_item flmi on a.model_id = flmi.value_id and flmi.status = 1 \n" +
                "                join flexible_list flm on flm.id = flmi.list_id and flm.name = 'model' \n" +
                "                join flexible_list_item flbi on flmi.ec_int2 = flbi.value_id and flbi.status = 1 \n" +
                "                join flexible_list flb on flb.id = flbi.list_id and flb.name = 'brand' and flb.status = 1 \n" +
                "            where a.status = 1 and a.id = ? " +
                "            ORDER BY a.id";
    */
    public static final String ADD_FLEXIBLE_LIST_ITEM = "insert into flexible_list_item(" +
            "id, list_id, value_id, value_name, " +
            "ec_int1, ec_int2, ec_int3, ec_int4, ec_int5, ec_int6," +
            "ec_dec1, ec_dec2, " +
            "ec_str1, ec_str2, idate, status)" +
            "values(null, ?, ?, ?, " +
            "?, ?, ?, ?, ?, ?, " +
            "?, ?, " +
            "?, ?, current_timestamp(), 1)";

    public static final String UPDATE_FLEXIBLE_LIST_ITEM = "update flexible_list_item " +
            "set list_id = ?, value_id = ?, value_name = ?, " +
            "ec_int1 = ?, ec_int2 = ?, ec_int3 = ?, ec_int4 = ?, ec_int5 = ?, ec_int6 = ?, " +
            "ec_dec1 = ?, ec_dec2 = ?, " +
            "ec_str1 = ?, ec_str2 = ?, udate = current_timestamp() " +
            "where id = ? and status = 1";

    public static final String DELETE_FLEXIBLE_LIST_ITEM = "update flexible_list_item" +
            " set status = 0 " +
            " where id = ? and status = 1";

    public static final String GET_FLEXIBLE_LIST = "select id, name, idate, udate, status " +
            "from flexible_list " +
            "where status = 1 ";

    public static final String GET_FLEXIBLE_LIST_ITEMS_BY_LIST_NAME = " " +
            "select li.id, li.list_id, li.value_id, li.value_name, " +
            "   li.ec_int1, li.ec_int2, li.ec_dec1, li.ec_dec2, " +
            "   li.ec_str1, li.ec_str2, li.idate, li.udate, li.status " +
            "     from flexible_list_item li join flexible_list fl on li.list_id = fl.id " +
            "        and fl.status = 1 " +
            "        and li.status = 1 " +
            "       and fl.name = ? ";

    public static final String GET_FLEXIBLE_LIST_ITEMS_BY_LIST_ID =
            "select li.id, li.list_id, li.value_id, li.value_name, " +
                    "   li.ec_int1, li.ec_int2, li.ec_dec1, li.ec_dec2, " +
                    "   li.ec_str1, li.ec_str2, " +
                    "   li.idate, li.udate, li.status " +
                    "     from flexible_list_item li join flexible_list fl on li.list_id = fl.id " +
                    "        and fl.status = 1 " +
                    "        and li.status = 1 " +
                    "       and fl.id = ? ";

    public static final String GET_FLEXIBLE_LIST_ITEM_BY_ID = " " +
            "select li.id, li.list_id, li.value_id, li.value_name, " +
            "   li.ec_int1, li.ec_int2, li.ec_dec1, li.ec_dec2, " +
            "   li.ec_str1, li.ec_str2, li.idate, li.udate, li.status " +
            "     from flexible_list_item li " +
            " where li.id = ? and li.status = 1";

    public static final String GET_PENDING_AUTOS = "select a.id auto_id, b.name marka, m.name model, a.year il, a.mileage km, a.engine engine, " +
            "c.name city, a.create_date create_date from auto a " +
            "join model m on a.model_id= m.id " +
            "join brand b on m.brand_id = b.id " +
            "join city c on a.city_id = c.id " +
            "where a.auto_status =  0 limit ? offset ? ";

    public static final String GET_AUTO_SIMPLE_BY_ID = "select a.id auto_id, b.name marka, " +
            "m.name model, a.year il, a.mileage km, a.engine engine, " +
            "c.name city, a.create_date create_date from auto a " +
            "join model m on a.model_id= m.id " +
            "join brand b on m.brand_id = b.id " +
            "join city c on a.city_id = c.id " +
            "where a.id = ? and a.status = 1 ";

    public static final String GET_AUTO_DETAILED_BY_ID = "select a.id as auto_id, ash.name autoshop , us.name user_name, us.surname surname, us.email email," +
            "us.id user_id, us.mobile1 mobile, mo.name as model, b.name as marka," +
            "a.price price, cu.name as currency, a.year il, a.create_date create_date, me.file_name file, a.mileage km, " +
            "a.used used,ci.name as city_name, co1.name as exterior_color_name, co2.name as interior_color_name," +
            "aut.type as auto_type_name,a.vin vin_code, a.engine engine, a.power_horse power_horse, ft.name as fuel_type_name," +
            "ec.name as euro_class_name,gt.name as gear_type_name, a.seat, a.door door, cl.name as climatisation_name," +
            "a.auto_pilot auto_pilot, a.airbag airbag, lt.name as light_type_name,ps.name as parking_sensor_name," +
            "im.name as interior_material_name, a.damaged damaged,a.problem problem, a.first_owner first_owner," +
            "a.seat seat,a.bluetooth , a.start_stop start_stop, a.side_mirror mirror, a.electric_window electric_window," +
            "a.central_locking central_locking, a.abs abs, a.esp esp, a.alarm alarm, a.sunroof sunroof, a.description  " +
            "from auto a join model mo on a.model_id = mo.id " +
            "join brand b on mo.brand_id = b.id " +
            "join currency cu on a.currency_id = cu.id " +
            "join city ci on  a.city_id = ci.id " +
            "join colour co1 on a.exterior_color = co1.id " +
            "left join colour co2 on a.interior_color=co2.id " +
            "join media me on a.id = me.auto_id " +
            "left join auto_type aut on a.auto_type_id = aut.id " +
            "join fuel_type ft on a.fuel_type_id = ft.id " +
            "left join gear_type gt on a.gear_type_id  = gt.id " +
            "left join climatization cl on a.climatization_id = cl.id " +
            "left join light_type lt on a.light_type_id =  lt.id " +
            "left join parking_sensor ps on a.parking_sensor_id = ps.id " +
            "left join interior_material im on a.interior_material_id = im.id " +
            "left join euro_type ec on a.euro_class_id = ec.id " +
            "join seller se on se.auto_id = a.id " +
            "left join user us on us.id = se.user_id " +
            "left join auto_shop ash on ash.id = se.autoshop_id " +
            "where a.id = ? and  me.main = 1 and a.status = 1 ";

    public static final String ADD_MEDIA = "insert into media(id, auto_id, original_filename, file_name, main, " +
            " video, mobile, mime_type, file_length, status) " +
            "values(null, ?, ?, ?, ?, ?, ?, ?, ?, 1)";

    public static final String GET_MEDIA_BY_ID = "select id, auto_id, original_filename, file_name, main, video, mobile," +
            " mime_type, file_length " +
            "from media " +
            "where id = ? and status = 1";

    public static final String GET_ALL_FLEXIBLE_LIST_ITEM_BY_LIST_NAME = "SELECT fli.id, fli.list_id, fli.value_name, fli.value_id, " +
            " fli.ec_int1, fli.ec_int2, fli.ec_int3, fli.ec_str1, fli.ec_dec1, fli.idate, fli.udate " +
            "FROM flexible_list_item fli join flexible_list fl on fli.list_id = fl.id " +
            "WHERE fl.name = ? and fli.status = 1 and fli.status = 1";

    public static final String GET_FLEXITEM_BY_JOINED_LIST_VALUE_NAME = "SELECT flmi.id as id,flmi.list_id as list_id,flmi.value_id as value_id, flmi.value_name as value_name, flmi.ec_int2 as brand_id, flbi.value_name as brand_name  \n" +
            "        FROM flexible_list_item as flmi RIGHT JOIN flexible_list_item flbi ON flmi.ec_int2=flbi.value_id  \n" +
            "        JOIN flexible_list as flb ON flb.id=flbi.list_id and flb.name=? and flb.status=1  \n" +
            "        WHERE flmi.status=1 and flbi.value_name =? ";

    public static final String GET_FLEXITEM_BY_JOINED_LIST_VALUE_ID = "SELECT flmi.id as id,flmi.list_id as list_id,flmi.value_id as value_id, flmi.value_name as value_name, flmi.ec_int2 as brand_id, flbi.value_name as brand_name  \n" +
            "        FROM flexible_list_item as flmi RIGHT JOIN flexible_list_item flbi ON flmi.ec_int2=flbi.value_id  \n" +
            "        JOIN flexible_list as flb ON flb.id=flbi.list_id and flb.name=? and flb.status=1  \n" +
            "        WHERE flmi.status=1 and flbi.value_id =? ";


    public static final String CHECK_EMAIL = "select count(id) cnt " +
            "from user " +
            "where email = ? and status = 1";

    public static final String CHECK_MOBILE = "select count(id) cnt " +
            "from user " +
            "where (mobile1 = ? or mobile2 = ?) and status = 1";


    public static final String GET_APPROVED_AUTOS = "select a.id auto_id, b.name marka, m.name model, a.year il, a.mileage km, a.engine," +
            "            c.name city, a.create_date from auto a " +
            "            join model m on a.model_id= m.id " +
            "            join brand b on m.brand_id = b.id " +
            "            join city c on a.city_id = c.id   " +
            "            where a.auto_status =  1 limit ? offset ? ";


    public static final String GET_ALL_USERS = "select id, name, surname, email, mobile1, mobile2, registration_date, status " +
            "from user limit ? offset ? ";

    public static final String GET_USER_INFORMATION_BY_ID = "select id, name, surname, email, mobile1, mobile2, registration_date, status " +
            "            from user where id=? ";

    public static final String GET_COUNT_APPROVED_AUTOS = "select count(*) from auto where auto_status = 1";

    public static final String GET_COUNT_PENDING_AUTOS = "select count(*) from auto where auto_status = 0";

    public static final String COUNT_ALL_USERS = "SELECT COUNT(*) FROM user;";


    public static final String GET_AUTOS_BY_USER_ID = "select a.id auto_id, b.name marka, m.name model, a.year il, a.mileage km, a.engine engine,  \n" +
            "            c.name city, a.create_date create_date " +
            "            from auto a  " +
            "            join model m on a.model_id= m.id " +
            "            join brand b on m.brand_id = b.id " +
            "            join city c on a.city_id = c.id " +
            "            join seller on seller.auto_id=a.id " +
            "            join user on seller.user_id=user.id " +
            "            where user_id=? " +
            "            ";


    public static final String GET_INCREMENTED_BRAND_ID =
            "SELECT max(value_id)+1 FROM autobazar2.flexible_list_item where list_id=2;";

    public static final String INSERT_NEW_BRAND = "insert into flexible_list_item(list_id, value_id, value_name, status)\n" +
            "values(2,?,?,?);";

    public static final String ADD_USER = "insert into user(name, surname, email, password, mobile1, user_status, status) " +
            "values(?, ?, ?, ?, ?, 0, 1)";

    public static final String ADD_USER_ROLE = "insert into user_role(user_id, role_id) values(?, ?)";

    public static final String ADD_TOKEN = "insert into token(value, type, user_id, generation_time, expire_time) " +
            "values(?, ?, ?, ?, ?)";

    public static final String GET_USER_BY_EMAIL = "select id, name, surname, email, password, mobile1, mobile2, " +
            "   registration_date, activation_date, user_status, status " +
            "from user " +
            "where email = ? and status = 1";

    public static final String GET_USER_ROLES = "select r.id, r.success_page, r.priority  from user_role ur " +
            "   join user u on ur.user_id = u.id and ur.status = 1 and u.status = 1 " +
            "   join role r on ur.role_id = r.id and r.status = 1 " +
            " where u.id = ?  " +
            "order by r.priority ";

    public static final String GET_PENDING_NOTIFICATIONS = " select id, `from`,`to`,type, content,subject," +
            " source_system, process_status, log_data, idate, udate " +
            " from notification " +
            " where type = ? and process_status = 0 and status = 1 " +
            " order by id" +
            " limit ?";


    public static final String UPDATE_NOTIFICATION = "update notification " +
            " set process_status = ?, udate = current_timestamp(), log_data = ? " +
            " where id = ? and status = 1";

    public static final String GET_NOTIFICATION_BY_ID = " select id, `from`,`to`,type, content,subject," +
            " source_system, process_status, log_data, idate, udate  " +
            " from notification " +
            " where status = 1 and id = ?";

    public static final String ADD_NOTIFICATION = "insert into notification(`from`, `to`, type, " +
            " content, subject, status, source_system, process_status) " +
            "values(?, ?, ?, " +
            "   ?, ?, 1, ?, 0)";
}

