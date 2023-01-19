package az.autobazar.service.impl;

import az.autobazar.domain.Auto;
import az.autobazar.domain.DataTableResult;
import az.autobazar.domain.User;
import az.autobazar.repository.AutoRepository;
import az.autobazar.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AutoServiceImpl implements AutoService {


    @Autowired
    private AutoRepository autoRepository;

    @Autowired
    DataTableResult dataTableResult;

    @Override
    public int getCountPendingAutos() {
        return autoRepository.getCountPendingAutos();
    }

    @Override
    public int getCountApprovedAutos() {
        return autoRepository.getCountApprovedAutos();
    }

    @Override
    public Optional<User> getUserInformationById(long id) {
        return autoRepository.getUserInformationById(id);
    }

    @Override
    public List<Auto> getAutosByUserId(long id) {
        return autoRepository.getAutosByUserId(id);
    }

    @Override
    public int getCountUsers() {
        return autoRepository.getCountUsers();
    }



    @Override
    public Optional<Auto>getPendingAutoDetailById(long id) {

       return  autoRepository.getPendingAutoDetailById(id);
    }


    @Override
    public List<Auto> getAutoList() {
        return autoRepository.getAutoList();
    }

    @Override
    public Optional<Auto> getAutoById(long id,boolean simple) {
        return autoRepository.getAutoById(id,simple);
    }

    @Override
    public Boolean insertBrand(String value_name, int status) {
        return autoRepository.insertBrand(value_name, status);
    }


    @Override
    public DataTableResult getDataTableApproved(int draw, int start, int length) {

        int countAuto = getCountApprovedAutos();

        dataTableResult.setDraw(draw);
        dataTableResult.setRecordsFiltered(countAuto);
        dataTableResult.setRecordsTotal(countAuto);


        List<Auto> datatables = autoRepository.getApprovedAutos(length,start);
        Object [][] data = new Object[datatables.size()][9];
        int counter = 0;

        for(Auto ad: datatables){
            data [counter][0] = ad.getId();
            data [counter][1] = ad.getModel().getBrand().getName();
            data [counter][2] = ad.getModel().getName();
            data [counter][3] = ad.getYear();
            data [counter][4] = ad.getMileage();
            data [counter][5] = ad.getEngine();
            data [counter][6] = ad.getCity().getName();
            data [counter][7] = ad.getCreateDateTime();
            data [counter][8] = "<a href=action?/admin/approvedAutoDetail=" +ad.getId() +"> ətraflı</a>";
            counter++;
        }
        dataTableResult.setData(data);


        return dataTableResult;
    }


    @Override
    public DataTableResult getDataUsers(int draw, int start, int length) {

        int countAuto = getCountUsers();

        dataTableResult.setDraw(draw);
        dataTableResult.setRecordsFiltered(countAuto);
        dataTableResult.setRecordsTotal(countAuto);


        List<User> datatables = autoRepository.getAllUsers(length,start);
        Object [][] data = new Object[datatables.size()][9];
        int counter = 0;

        for(User ad: datatables){
            data [counter][0]=ad.getId();
            data [counter][1]=ad.getName();
            data [counter][2]=ad.getSurname();
            data [counter][3]=ad.getEmail();
            data [counter][4]=ad.getMobile1();
            data [counter][5]=ad.getMobile2();
            data [counter][6]=ad.getRegistrationDate();
            data [counter][7]=ad.getStatus();

            data [counter][8] = "<a href=userInformation?id=" +ad.getId() +"> ətraflı</a>";
//            data [counter][8] = "<a href=userInformation/" +ad.getId() +"> ətraflı</a>";
            counter++;
        }
        dataTableResult.setData(data);


        return dataTableResult;
    }

    @Override
    public DataTableResult getDataTable(int draw,int start, int length) {


        int countAuto = getCountPendingAutos();

        dataTableResult.setDraw(draw);
        dataTableResult.setRecordsFiltered(countAuto);
        dataTableResult.setRecordsTotal(countAuto);




        List<Auto>  pendingAutos = autoRepository.getPendingAutos(length,start);

        Object [][] data = new Object[pendingAutos.size()][8];
        int counter = 0;

        for(Auto ad: pendingAutos){
            data [counter][0] = ad.getModel().getBrand().getName();
            data [counter][1] = ad.getModel().getName();
            data [counter][2] = ad.getYear();
            data [counter][3] = ad.getMileage();
            data [counter][4] = ad.getEngine();
            data [counter][5] = ad.getCity().getName();
            data [counter][6] = ad.getCreateDateTime();
            data [counter][7] = "<a href=pendingAutoDetail?id=" +ad.getId() +">ətraflı:" +ad.getId()+ "</a>";
            counter++;
        }
        dataTableResult.setData(data);


        return dataTableResult;
    }
}
