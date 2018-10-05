package sk.stopangin.specification.model;


import sk.stopangin.specification.model.security.User;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "orders")
public class Order implements Serializable {

    private static final long serialVersionUID = 3582550258798302355L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "patient_name", length = 100)
    private String patientName;

    @Column(name = "patient_first_name", length = 100)
    private String patientFirstName;

    @Column(name = "check_patient_reimbursed")
    private Integer checkPatientReimbursed;

    @Column(name = "sleep_doctor_name", length = 100)
    private String sleepDoctorName;

    @Column(name = "sleep_doctor_first_name", length = 100)
    private String sleepDoctorFirstName;

    @Column(name = "dlp_sleep_doctor_first_name", length = 100)
    private String dlpSleepDoctorFirstName;

    @Column(name = "dlp_sleep_doctor_last_name", length = 100)
    private String dlpSleepDoctorLastName;

    @Column(name = "check_renewal")
    private Boolean checkRenewal;

    @Column(name = "check_digital_or_conventional_impressions_or_scan")
    private Integer checkDigitalOrConventionalImpressionsOrScan;

    @Column(name = "device_type", length = 100)
    private String deviceType;

    @Column(name = "device_number", length = 100)
    private String deviceNumber;

    @Column(name = "check_bite_registration_or_measurements_in_max_protrusion")
    private Integer checkBiteRegistrationOrMeasurementsInMaxProtrusion;

    @Column(name = "check_reduce_to_max_or_to_reg")
    private Integer checkReduceToMaxOrToReg;

    @Column(name = "distance_from_incisor", length = 100)
    private String distanceFromIncisor;

    @Column(name = "midline_deviation", length = 100)
    private String midlineDeviation;

    @Column(name = "check_bite_registration_in_centric_occlusion")
    private Boolean checkBiteRegistrationInCentricOcclusion;

    @Column(name = "check_renewal_protrusion_settings")
    private Boolean checkRenewalProtrusionSettings;

    @Column(name = "max_protrusion", length = 100)
    private String maxProtrusion;

    @Column(name = "check_teeth_to_protect")
    private Boolean checkTeethToProtect;

    @Column(name = "teeth_to_protect_txt", length = 100)
    private String teethToProtectTxt;

    @Column(name = "check_broken_teeth")
    private Boolean checkBrokenTeeth;

    @Column(name = "broken_teeth_txt", length = 100)
    private String brokenTeethTxt;


    @Column(name = "check_future_restoration")
    private Boolean checkFutureRestoration;

    @Column(name = "future_restoration_txt", length = 100)
    private String futureRestorationTxt;

    @Column(name = "check_other_text")
    private Boolean checkOtherText;

    @Column(name = "other_text_txt", length = 100)
    private String otherTextTxt;

    @Column(name = "check_complete_lower_implant")
    private Boolean checkCompleteLowerImplant;

    @Column(name = "check_presence_of_removable")
    private Boolean checkPresenceOfRemovable;

    @Column(name = "check_complete_lower_denture_retained")
    private Boolean checkCompleteLowerDentureRetained;

    @Column(name = "check_complete_upper_denture")
    private Boolean checkCompleteUpperDenture;

    @Column(name = "design_lower_check")
    private Integer designLowerCheck;

    @Column(name = "design_upper_check")
    private Integer designUpperCheck;

    @Column(name = "dentist_name", length = 100)
    private String dentistName;

    @Column(name = "dentist_first_name", length = 100)
    private String dentistFirstName;

    @Column(name = "dentist_email", length = 100)
    private String dentistEmail;

    @Column(name = "delivery_address", length = 100)
    private String deliveryAddress;

    @Column(name = "billing_address", length = 100)
    private String billingAddress;

    @Column(name = "phone_number", length = 100)
    private String phoneNumber;

    @Column(name = "country", length = 100)
    private String country;

    @Column(name = "payment_type")
    private Integer paymentType;

    @Column(name = "payment_email", length = 100)
    private String paymentEmail;

    @Column(name = "order_status")
    private Integer orderStatus;

    @Column(name = "order_creator")
    private String orderCreator;

    @ManyToOne
    @JoinColumn (name = "order_creator_id")
    private User orderCreatorId;

    @Column(name = "create_time")
    private Long orderCreateTime;

    @Column(name = "check_cover_all_the_last_molars")
    private Boolean checkCoverAllTheLastMolars;

    @Column(name = "check_design_fulfil")
    private Boolean checkDesignFulfil;

    @Column(name = "check_add_slots")
    private Boolean checkAddSlots;

    @Column(name = "attachments")
    private String attachments;

    @Column(name = "sleep_doctor_email")
    private String sleepDoctorEmail;

    @Column(name = "impression_attachments")
    private String impressionAttachments;

    @Column(name = "welcome_package")
    private Boolean welcomePackage;

    @Column(name = "order_type")
    private Integer orderType;

    @Column(name = "device_serial_number")
    private String deviceSerialNumber;

    @Column(name = "return_reason")
    private String returnReason;

    @Column(name = "use_old_scans")
    private Integer useOldScans;

    @Column(name = "use_old_specs")
    private Integer useOldSpecs;

    @Column(name = "version")
    private String version;

    @Column(name = "inform_slp_dctr_refused")
    private Boolean informSleepDoctorRefused;

    @Column(name = "conduct_stats_refused")
    private Boolean conductStatsRefused;

    public String getImpressionAttachments() {
        return impressionAttachments;
    }

    public void setImpressionAttachments(String impressionAttachments) {
        this.impressionAttachments = impressionAttachments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public Integer getCheckPatientReimbursed() {
        return checkPatientReimbursed;
    }

    public void setCheckPatientReimbursed(Integer checkPatientReimbursed) {
        this.checkPatientReimbursed = checkPatientReimbursed;
    }

    public String getSleepDoctorName() {
        return sleepDoctorName;
    }

    public void setSleepDoctorName(String sleepDoctorName) {
        this.sleepDoctorName = sleepDoctorName;
    }

    public String getSleepDoctorFirstName() {
        return sleepDoctorFirstName;
    }

    public void setSleepDoctorFirstName(String sleepDoctorFirstName) {
        this.sleepDoctorFirstName = sleepDoctorFirstName;
    }

    public String getDlpSleepDoctorFirstName() {
        return dlpSleepDoctorFirstName;
    }

    public void setDlpSleepDoctorFirstName(String dlpSleepDoctorFirstName) {
        this.dlpSleepDoctorFirstName = dlpSleepDoctorFirstName;
    }

    public String getDlpSleepDoctorLastName() {
        return dlpSleepDoctorLastName;
    }

    public void setDlpSleepDoctorLastName(String dlpSleepDoctorLastName) {
        this.dlpSleepDoctorLastName = dlpSleepDoctorLastName;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    public Integer getCheckBiteRegistrationOrMeasurementsInMaxProtrusion() {
        return checkBiteRegistrationOrMeasurementsInMaxProtrusion;
    }

    public void setCheckBiteRegistrationOrMeasurementsInMaxProtrusion(Integer checkBiteRegistrationOrMeasurementsInMaxProtrusion) {
        this.checkBiteRegistrationOrMeasurementsInMaxProtrusion = checkBiteRegistrationOrMeasurementsInMaxProtrusion;
    }

    public Integer getCheckReduceToMaxOrToReg() {
        return checkReduceToMaxOrToReg;
    }

    public void setCheckReduceToMaxOrToReg(Integer checkReduceToMaxOrToReg) {
        this.checkReduceToMaxOrToReg = checkReduceToMaxOrToReg;
    }

    public String getDistanceFromIncisor() {
        return distanceFromIncisor;
    }

    public void setDistanceFromIncisor(String distanceFromIncisor) {
        this.distanceFromIncisor = distanceFromIncisor;
    }

    public String getMidlineDeviation() {
        return midlineDeviation;
    }

    public void setMidlineDeviation(String midlineDeviation) {
        this.midlineDeviation = midlineDeviation;
    }

    public String getMaxProtrusion() {
        return maxProtrusion;
    }

    public void setMaxProtrusion(String maxProtrusion) {
        this.maxProtrusion = maxProtrusion;
    }

    public String getTeethToProtectTxt() {
        return teethToProtectTxt;
    }

    public void setTeethToProtectTxt(String teethToProtectTxt) {
        this.teethToProtectTxt = teethToProtectTxt;
    }

    public String getBrokenTeethTxt() {
        return brokenTeethTxt;
    }

    public void setBrokenTeethTxt(String brokenTeethTxt) {
        this.brokenTeethTxt = brokenTeethTxt;
    }

    public String getFutureRestorationTxt() {
        return futureRestorationTxt;
    }

    public void setFutureRestorationTxt(String futureRestorationTxt) {
        this.futureRestorationTxt = futureRestorationTxt;
    }

    public String getOtherTextTxt() {
        return otherTextTxt;
    }

    public void setOtherTextTxt(String otherTextTxt) {
        this.otherTextTxt = otherTextTxt;
    }

    public Boolean getCheckCompleteLowerDentureRetained() {
        return checkCompleteLowerDentureRetained;
    }

    public void setCheckCompleteLowerDentureRetained(Boolean checkCompleteLowerDentureRetained) {
        this.checkCompleteLowerDentureRetained = checkCompleteLowerDentureRetained;
    }

    public Boolean getCheckCompleteUpperDenture() {
        return checkCompleteUpperDenture;
    }

    public void setCheckCompleteUpperDenture(Boolean checkCompleteUpperDenture) {
        this.checkCompleteUpperDenture = checkCompleteUpperDenture;
    }

    public Integer getDesignLowerCheck() {
        return designLowerCheck;
    }

    public void setDesignLowerCheck(Integer designLowerCheck) {
        this.designLowerCheck = designLowerCheck;
    }

    public Integer getDesignUpperCheck() {
        return designUpperCheck;
    }

    public void setDesignUpperCheck(Integer designUpperCheck) {
        this.designUpperCheck = designUpperCheck;
    }

    public String getDentistName() {
        return dentistName;
    }

    public void setDentistName(String dentistName) {
        this.dentistName = dentistName;
    }

    public String getDentistFirstName() {
        return dentistFirstName;
    }

    public void setDentistFirstName(String dentistFirstName) {
        this.dentistFirstName = dentistFirstName;
    }

    public String getDentistEmail() {
        return dentistEmail;
    }

    public void setDentistEmail(String dentistEmail) {
        this.dentistEmail = dentistEmail;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getCheckRenewal() {
        return checkRenewal;
    }

    public void setCheckRenewal(Boolean checkRenewal) {
        this.checkRenewal = checkRenewal;
    }

    public Boolean getCheckBiteRegistrationInCentricOcclusion() {
        return checkBiteRegistrationInCentricOcclusion;
    }

    public void setCheckBiteRegistrationInCentricOcclusion(Boolean checkBiteRegistrationInCentricOcclusion) {
        this.checkBiteRegistrationInCentricOcclusion = checkBiteRegistrationInCentricOcclusion;
    }

    public Boolean getCheckRenewalProtrusionSettings() {
        return checkRenewalProtrusionSettings;
    }

    public void setCheckRenewalProtrusionSettings(Boolean checkRenewalProtrusionSettings) {
        this.checkRenewalProtrusionSettings = checkRenewalProtrusionSettings;
    }

    public Boolean getCheckTeethToProtect() {
        return checkTeethToProtect;
    }

    public void setCheckTeethToProtect(Boolean checkTeethToProtect) {
        this.checkTeethToProtect = checkTeethToProtect;
    }

    public Boolean getCheckBrokenTeeth() {
        return checkBrokenTeeth;
    }

    public void setCheckBrokenTeeth(Boolean checkBrokenTeeth) {
        this.checkBrokenTeeth = checkBrokenTeeth;
    }

    public Boolean getCheckFutureRestoration() {
        return checkFutureRestoration;
    }

    public void setCheckFutureRestoration(Boolean checkFutureRestoration) {
        this.checkFutureRestoration = checkFutureRestoration;
    }

    public Boolean getCheckOtherText() {
        return checkOtherText;
    }

    public void setCheckOtherText(Boolean checkOtherText) {
        this.checkOtherText = checkOtherText;
    }

    public Boolean getCheckCompleteLowerImplant() {
        return checkCompleteLowerImplant;
    }

    public void setCheckCompleteLowerImplant(Boolean checkCompleteLowerImplant) {
        this.checkCompleteLowerImplant = checkCompleteLowerImplant;
    }

    public Boolean getCheckPresenceOfRemovable() {
        return checkPresenceOfRemovable;
    }

    public void setCheckPresenceOfRemovable(Boolean checkPresenceOfRemovable) {
        this.checkPresenceOfRemovable = checkPresenceOfRemovable;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentEmail() {
        return paymentEmail;
    }

    public void setPaymentEmail(String paymentEmail) {
        this.paymentEmail = paymentEmail;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderCreator() {
        return orderCreator;
    }

    public void setOrderCreator(String orderCreator) {
        this.orderCreator = orderCreator;
    }

    public Long getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Long orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public Boolean getCheckCoverAllTheLastMolars() {
        return checkCoverAllTheLastMolars;
    }

    public void setCheckCoverAllTheLastMolars(Boolean checkCoverAllTheLastMolars) {
        this.checkCoverAllTheLastMolars = checkCoverAllTheLastMolars;
    }

    public Boolean getCheckDesignFulfil() {
        return checkDesignFulfil;
    }

    public void setCheckDesignFulfil(Boolean checkDesignFulfil) {
        this.checkDesignFulfil = checkDesignFulfil;
    }

    public Boolean getCheckAddSlots() {
        return checkAddSlots;
    }

    public void setCheckAddSlots(Boolean checkAddSlots) {
        this.checkAddSlots = checkAddSlots;
    }

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    public Integer getCheckDigitalOrConventionalImpressionsOrScan() {
        return checkDigitalOrConventionalImpressionsOrScan;
    }

    public void setCheckDigitalOrConventionalImpressionsOrScan(Integer checkDigitalOrConventionalImpressionsOrScan) {
        this.checkDigitalOrConventionalImpressionsOrScan = checkDigitalOrConventionalImpressionsOrScan;
    }

    public String getSleepDoctorEmail() {
        return sleepDoctorEmail;
    }

    public void setSleepDoctorEmail(String sleepDoctorEmail) {
        this.sleepDoctorEmail = sleepDoctorEmail;
    }

    public Boolean isWelcomePackage() {
        return welcomePackage;
    }

    public void setWelcomePackage(Boolean welcomePackage) {
        this.welcomePackage = welcomePackage;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getDeviceSerialNumber() {
        return deviceSerialNumber;
    }

    public void setDeviceSerialNumber(String deviceSerialNumber) {
        this.deviceSerialNumber = deviceSerialNumber;
    }

    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason;
    }

    public Integer getUseOldScans() {
        return useOldScans;
    }

    public void setUseOldScans(Integer useOldScans) {
        this.useOldScans = useOldScans;
    }

    public Integer getUseOldSpecs() {
        return useOldSpecs;
    }

    public void setUseOldSpecs(Integer useOldSpecs) {
        this.useOldSpecs = useOldSpecs;
    }

    public User getOrderCreatorId() {
        return orderCreatorId;
    }

    public void setOrderCreatorId(User orderCreatorId) {
        this.orderCreatorId = orderCreatorId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getInformSleepDoctorRefused() {
        return informSleepDoctorRefused;
    }

    public void setInformSleepDoctorRefused(Boolean informSleepDoctorRefused) {
        this.informSleepDoctorRefused = informSleepDoctorRefused;
    }

    public Boolean getConductStatsRefused() {
        return conductStatsRefused;
    }

    public void setConductStatsRefused(Boolean conductStatsRefused) {
        this.conductStatsRefused = conductStatsRefused;
    }
}