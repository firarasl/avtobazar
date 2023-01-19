package az.autobazar.service.impl;

import az.autobazar.domain.Brand;
import az.autobazar.service.BrandService;

import java.util.List;
import java.util.Optional;

public class BrandServiceImpl implements BrandService {
    @Override
    public List<Brand> getBrands() {
        return null;
    }

    @Override
    public Optional<Brand> getBrandById(long id) {
        return Optional.empty();
    }
}
