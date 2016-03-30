package com.chriswk.immutabletesting;

import java.util.List;
import java.util.Optional;

import org.immutables.value.Value;

@Value.Immutable
public interface SearchConfig {
    String searchKey();
    List<Integer> searchTimes();
    Optional<String> description();
}
