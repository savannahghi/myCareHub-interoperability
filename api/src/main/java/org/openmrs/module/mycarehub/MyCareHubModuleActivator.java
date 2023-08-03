/**
 * The contents of this file are subject to the OpenMRS Public License Version 1.0 (the "License");
 * you may not use this file except in compliance with the License. You may obtain a copy of the
 * License at http://license.openmrs.org
 *
 * <p>Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF
 * ANY KIND, either express or implied. See the License for the specific language governing rights
 * and limitations under the License.
 *
 * <p>Copyright (C) OpenMRS, LLC. All Rights Reserved.
 */
package org.openmrs.module.mycarehub;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.BaseModuleActivator;

/**
 * This class contains the logic that is run every time this module is either started or shutdown.
 */
public class MyCareHubModuleActivator extends BaseModuleActivator {

  /** Initializes logging configuration. */
  private final Log log = LogFactory.getLog(this.getClass());

  /** @see BaseModuleActivator#willStart() */
  public void willStart() {
    log.info("Starting MyCareHub Module");
  }

  /** @see BaseModuleActivator#started() */
  public void started() {
    log.info("MyCareHub Module started");
  }

  /** @see BaseModuleActivator#willStop() */
  public void willStop() {
    log.info("Stopping MyCareHub Module");
  }

  /** @see BaseModuleActivator#stopped() */
  public void stopped() {
    log.info("MyCareHub Module stopped");
  }
}
