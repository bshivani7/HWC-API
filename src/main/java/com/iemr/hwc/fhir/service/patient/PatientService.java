package com.iemr.hwc.fhir.service.patient;

import com.iemr.hwc.fhir.model.patient.PatientExt;
import javax.servlet.http.HttpServletRequest;

public interface PatientService {
    PatientExt createNewPatient(HttpServletRequest theRequest, PatientExt patientExt);
}
