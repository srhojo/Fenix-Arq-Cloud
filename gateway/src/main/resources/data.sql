INSERT INTO FX_GW_ROUTES (id,name,path,host,uri) VALUES (1,'EdgeOne','/edge-one/**',null,'lb://EDGE-ONE')

INSERT INTO FX_GW_ROUTES_HEADER(route_id,header,value) VALUES (1, 'Hello','World!')