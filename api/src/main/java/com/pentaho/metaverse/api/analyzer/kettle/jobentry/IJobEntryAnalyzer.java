package com.pentaho.metaverse.api.analyzer.kettle.jobentry;

import org.pentaho.di.job.entry.JobEntryInterface;
import com.pentaho.metaverse.api.IAnalyzer;

import java.util.Set;

/**
 * Created by mburgess on 7/29/14.
 */
public interface IJobEntryAnalyzer<S, T extends JobEntryInterface> extends IAnalyzer<S, T> {

  /**
   * Gets the set of job entry classes that can be analyzed by this analyzer
   *
   * @return a Set of JobEntryCopy classes that this analyzer supports
   */
  Set<Class<? extends JobEntryInterface>> getSupportedEntries();
}