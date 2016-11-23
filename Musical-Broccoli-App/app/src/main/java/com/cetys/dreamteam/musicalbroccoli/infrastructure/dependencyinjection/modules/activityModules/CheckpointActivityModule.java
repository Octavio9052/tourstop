package com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.modules.activitymodules;

import com.cetys.dreamteam.musicalbroccoli.infrastructure.dependencyinjection.scopes.ActivityScope;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.CheckpointViewModelImpl;
import com.cetys.dreamteam.musicalbroccoli.presentation.viewModels.contracts.CheckpointViewModel;
import com.cetys.dreamteam.musicalbroccoli.presentation.views.activities.CheckpointActivity;

import dagger.Module;
import dagger.Provides;

/**
 * @Author J. Pichardo on 11/23/2016.
 */
@Module
public class CheckpointActivityModule {

    private final CheckpointActivity checkpointActivity;

    public CheckpointActivityModule( CheckpointActivity checkpointActivity ) {
        this.checkpointActivity = checkpointActivity;
    }

    @ActivityScope
    @Provides
    CheckpointActivity providesCheckpointActivity() {
        return this.checkpointActivity;
    }

    @ActivityScope
    @Provides
    CheckpointViewModel providesCheckpointViewModel() {
        return new CheckpointViewModelImpl( this.checkpointActivity );
    }
}
