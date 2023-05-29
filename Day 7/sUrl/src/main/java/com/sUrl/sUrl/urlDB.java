package com.sUrl.sUrl;

import java.util.*;
import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface urlDB extends JpaRepository<url,String>{

	/**
	 * @return
	 */

    
}
