package it.academy.HopeProject.services.Impl;

import it.academy.HopeProject.entity.Fund;
import it.academy.HopeProject.models.BaseFundModel;

public interface FundService extends BaseService<Fund, BaseFundModel> {
    Fund create(BaseFundModel model,String category) throws Exception;
}
