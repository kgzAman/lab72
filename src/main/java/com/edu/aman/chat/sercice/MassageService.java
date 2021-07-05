package com.edu.aman.chat.sercice;

import com.edu.aman.chat.entity.Massage;
import com.edu.aman.chat.repository.MassageRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
//public class MassageService {
//    private final MassageRepository massageRepository;
//
//    public List<Massage> getAll() {
//        List<Massage> massages= massageRepository.findAll();
//        if(massages==null){
//            List<Massage> massages1 = new ArrayList<>();
//            return massages1;
//        }else return massages;
//    }
}
