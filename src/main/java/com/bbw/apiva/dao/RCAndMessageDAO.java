package com.bbw.apiva.dao;

import com.bbw.apiva.domain.RCAndMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RCAndMessageDAO extends JpaRepository<RCAndMessage, Integer> {

    @Query(value = "SELECT rc FROM RC_AND_MESSAGE WHERE rc =000", nativeQuery = true)
    Integer getRCSuccess();

    @Query(value = "SELECT rc FROM RC_AND_MESSAGE WHERE rc =001", nativeQuery = true)
    Integer getRCHeaderNotComplete();

    @Query(value = "SELECT rc FROM RC_AND_MESSAGE WHERE rc =002", nativeQuery = true)
    Integer getRCTokenNotValid();

    @Query(value = "SELECT rc FROM RC_AND_MESSAGE WHERE rc =003", nativeQuery = true)
    Integer getRCVANotFound();

    @Query(value = "SELECT rc FROM RC_AND_MESSAGE WHERE rc =004", nativeQuery = true)
    Integer getRCSignatureNotValid();

    @Query(value = "SELECT rc FROM RC_AND_MESSAGE WHERE rc =005", nativeQuery = true)
    Integer getRCClientIDNotFound();

    @Query(value = "SELECT rc FROM RC_AND_MESSAGE WHERE rc =006", nativeQuery = true)
    Integer getRCGeneralError();

    @Query(value = "SELECT message FROM RC_AND_MESSAGE WHERE rc =000", nativeQuery = true)
    String getMessageSuccess();

    @Query(value = "SELECT message FROM RC_AND_MESSAGE WHERE rc =001", nativeQuery = true)
    String getMessageHeaderNotComplete();

    @Query(value = "SELECT message FROM RC_AND_MESSAGE WHERE rc =002", nativeQuery = true)
    String getMessageTokenNotValid();

    @Query(value = "SELECT message FROM RC_AND_MESSAGE WHERE rc =003", nativeQuery = true)
    String getMessageVANotFound();

    @Query(value = "SELECT message FROM RC_AND_MESSAGE WHERE rc =004", nativeQuery = true)
    String getMessageSignatureNotValid();

    @Query(value = "SELECT message FROM RC_AND_MESSAGE WHERE rc =005", nativeQuery = true)
    String getMessageClientIDNotFound();

    @Query(value = "SELECT message FROM RC_AND_MESSAGE WHERE rc =006", nativeQuery = true)
    String getMessageGeneralError();
}
