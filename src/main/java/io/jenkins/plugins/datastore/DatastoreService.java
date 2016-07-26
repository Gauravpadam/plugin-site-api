package io.jenkins.plugins.datastore;

import io.jenkins.plugins.models.Category;
import io.jenkins.plugins.models.Labels;
import io.jenkins.plugins.models.Plugin;
import io.jenkins.plugins.models.Plugins;

import java.util.List;

public interface DatastoreService {

  Plugins search(String query, String sort, List<String> labels, List<String> authors, String core, Integer size, Integer page) throws DatastoreException;

  Plugin getPlugin(String name) throws DatastoreException;

  List<Category> getCategories() throws DatastoreException;

  Labels getLabels() throws DatastoreException;

}
