package org.openmrs.module.mycarehub.api.service;


import java.util.List;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.mycarehub.model.HealthDiary;

public interface HealthDiaryService extends OpenmrsService {

  List<HealthDiary> saveHealthDiaries(List<HealthDiary> healthDiary);

  Number countHealthDiaries(String searchString);

  List<HealthDiary> getPagedHealthDiaries(
      String searchString, Integer pageNumber, Integer pageSize);

  void fetchPatientHealthDiaries();
}
