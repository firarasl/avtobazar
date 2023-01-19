package az.autobazar.service.impl;

import az.autobazar.repository.CommonRepository;
import az.autobazar.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonServiceImpl implements CommonService {

    @Autowired
    private CommonRepository repository;

    @Override
    public boolean checkEmail(String email) {
        return repository.checkEmail(email);
    }

    @Override
    public boolean checkMobile(String mobile) {
        return repository.checkMobile(mobile);
    }
}
