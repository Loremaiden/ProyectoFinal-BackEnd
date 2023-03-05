import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './componentes/header/header.component';
import { LogoapComponent } from './componentes/logoap/logoap.component';
import { BannerComponent } from './componentes/banner/banner.component';
import { SocialComponent } from './componentes/social/social.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoapComponent,
    BannerComponent,
    SocialComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
