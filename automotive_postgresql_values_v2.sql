INSERT INTO building (building_name) values ('v�roba');
INSERT INTO building (building_name) values ('��etnictv�');
INSERT INTO building (building_name) values ('headquarters');
INSERT INTO building (building_name) values ('z�vodn� j�delna');
INSERT INTO building (building_name) values ('odpadov� hala');
INSERT INTO building (building_name) values ('stroj�renstv�');

INSERT INTO manager (manager_firstname,manager_surname,salary,building_id) values ('Miroslav','Hladk�',100000.00,1);
INSERT INTO manager (manager_firstname,manager_surname,salary,building_id) values ('Nat�lie','Syrov�',82000,2);
INSERT INTO manager (manager_firstname,manager_surname,salary,building_id) values ('Rudolf','Bedna��k',135000,3);
INSERT INTO manager (manager_firstname,manager_surname,salary,building_id) values ('Al�b�ta','Stupkov�',35000,4);
INSERT INTO manager (manager_firstname,manager_surname,salary,building_id) values ('Marcel','�im��k',43200,5);

INSERT INTO job (job_type,salary) values ('d�ln�k',22000.00);
INSERT INTO job (job_type,salary) values ('ukl�ze�ka',18000.00);
INSERT INTO job (job_type,salary) values ('vedouc� v�roby',33200.00);
INSERT INTO job (job_type,salary) values ('IT technik',35000.00);
INSERT INTO job (job_type,salary) values ('��etn�',29500.00);
INSERT INTO job (job_type,salary) values ('kucha�',22000.00);
INSERT INTO job (job_type,salary) values ('spr�vce odpad�',27500.00);
INSERT INTO job (job_type,salary) values ('pomocn� kucha�',20000.00);
INSERT INTO job (job_type,salary) values ('stroja�',51000.00);

INSERT INTO customer(customer_f_name,customer_s_name) values ('Dominik','Strouhal');
INSERT INTO customer(customer_f_name,customer_s_name) values ('Kate�ina','Karelov�');
INSERT INTO customer(customer_f_name,customer_s_name) values ('Martin','Ko��nek');
INSERT INTO customer(customer_f_name,customer_s_name) values ('Nat�lie','Pavelkov�');
INSERT INTO customer(customer_f_name,customer_s_name) values ('Michaela','Jahodov�');

INSERT INTO car(car_brand,car_color,customer_id) values ('Volkswagen','�erven�',3);
INSERT INTO car(car_brand,car_color,customer_id) values ('Volkswagen','�ern�',2);
INSERT INTO car(car_brand,car_color,customer_id) values ('BMW','�ern�',4);
INSERT INTO car(car_brand,car_color,customer_id) values ('BMW','b�l�',1);
INSERT INTO car(car_brand,car_color,customer_id) values ('�koda','st��brn�',5);

INSERT INTO contact(email,phone_number,customer_id) values ('domca.str@seznam.cz','+420621345876',1);
INSERT INTO contact(email,phone_number,customer_id) values ('katka.karelova@gmail,pswd.com','+420720753682',2);
INSERT INTO contact(email,phone_number,customer_id) values ('koren@centrum.cz','+420608879998',3);
INSERT INTO contact(email,phone_number,customer_id) values ('natalie.pavelkova@gmail,pswd.com','+420555666777',4);
INSERT INTO contact(email,phone_number,customer_id) values ('miluju,auta@seznam.cz','+420725438876',5);

INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Alena','Samkov�','alena.samkova@automotive.cz','BgZNZ@Vn7D',2);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Petr','Kalivoda','petr.kal@automotive.cz','P@npUd809L',3);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Hana','Jandov�','alena.jand@automotive.cz','tqA*1LIZfj',4);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Alois','Smola','alois.smola@automotive.cz','Xy$y^mWXVn',1);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Lubo�','Veverka','lubos.vever@automotive.cz','^#BMoZKb5F',1);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Mark�ta','Jankov�','mj.1@automotive.cz','G@VjSFS&P7',5);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Jakub','Ferenc','jakub.ferenc@automotive.cz','53dI$eNipl',5);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Zbyn�k','Hrn���','zbynek.hrncir@automotive.cz','3IdrL9aJ@x',2);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Vojt�ch','Sluka','vojtech.sluk@automotive.cz','=A3ResP4qa',1);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('�t�p�n','Be�v�r','stepan.becvar@automotive.cz','8*Lxothlz8',4);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('�imon','Motl','simon.motl@automotive.cz','SP$t?ln2T2',1);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Rostislav','Krop��ek','rost.krop@automotive.cz','7rETh*9o#u',1);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Richard','Mar��k','richard.mars@automotive.cz','fuRO49o#AH',1);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Adam','Vyb�ral','nevybral@automotive.cz','3Ebr$cIM1b',1);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Bohuslav','Berky','bohus.berky@automotive.cz','tHe$6Wr&va',1);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Jan','Hrom�dka','jan.hromadka@automotive.cz','2l*u?OMAdI',1);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Martin','Provazn�k','martin.provaz@automotive.cz','dR4swetrl*',1);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('V�t�zslav','�ern�','vita.cerny@automotive.cz','*r6kOdrLyE',1);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Milo�','Vrzal','vrzvrz@automotive.cz','nU*p1viPra',1);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Petr','Tr�ka','petr.trcka@automotive.cz','7iD=woChav',1);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Dalibor','V�lek','dalibor.valek@automotive.cz','$1kIWro8He',5);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Barbora','Pt��kov�','bara.ptack@automotive.cz','xl-HuPhA#2',2);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Ji��','Va��k','jiri.vasak@automotive.cz','m2Th&n8XEr',1);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Jitka','Peterkov�','jitka.peter@automotive.cz','1It=#PrAji',4);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Lud�k','D�dek','ludek.dedek@automotive.cz','s#3ke@ogEk',3);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Nat�lie','Danielov�','natalie.dan@automotive.cz','pUD!R77L?o',1);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Bo�ena','Fuksov�','bozena.fuks@automotive.cz','s4A&=tIFId',5);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Michal','Star�','michal.stary@automotive.cz','&a4OcH_tad',1);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Rostislav','�ebek','rosta.sebek@automotive.cz','gIy0TucoK$',5);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Tom�','Adam','tomas.adam@automotive.cz','pasT8?lzu+',3);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Jana','��kov�','jana.cizk@automotive.cz','qaHlq$Mi5P',5);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('So�a','Bauerov�','sona.bauer@automotive.cz','3@MupR&w3C',3);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('�imon','Sokol','simon.sokol@automotive.cz','sI*l+hiD5o',3);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Helena','Slez�kov�','helena.slezak@automotive.cz','wlmA9ra3@m',4);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Tom�','Barto�ek','tomas.bartos@automotive.cz','s&aP6!hEml',3);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Franti�ek','Benda','fanos.benda@automotive.cz','?osT7trEpa',3);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Emilie','Kub�tov�','emilie.kubat@automotive.cz','Pro8-TaZ8s',2);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Mark�ta','Dvorsk�','maka.dvorska@automotive.cz','7h3JurOf-U',5);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Radim','Dole�al','radim.dolez@automotive.cz','w*prE_O0RU',1);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Vendula','Pechov�','vendy.pech@automotive.cz','w?uqadlr4S',3);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Lubom�r','Van��ek','lubomir.van@automotive.cz','ph1+R&drOX',6);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Filip','My�ka','filip.myska@automotive.cz','f1IdRA+ine',6);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Lubom�r','Bene�','lubomir.benes@automotive.cz','Y_hu&iR5Me',6);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Ludv�k','Dani�','ludva.danis@automotive.cz','xa*I=8stlh',6);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('J�n','Kudrna','jan.kudrna@automotive.cz','b+u3e1T*jA',6);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Mat�j','Dvo���ek','matej.dvor@automotive.cz','9$zEYuBOxe',1);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Tom�','Hlav��','tom.hlavac@automotive.cz','3h&viCho@o',1);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Ludv�k','Gajdo�','ludva.gajdos@automotive.cz','C@U2ug9pUt',5);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Zbyn�k','Trnak','zbynek.trnka@tomotive.cz','4*CoNlSwiT',5);
INSERT INTO employee (first_name,surname,mail,pswd,building_id) values ('Kamil','Koutn�','kamil.koutny@automotive.cz','4*CoNlSwiT',5);

-- --UPDATE HESEL------ V�ECHNA HESLA JSOU 'test'
UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 1 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 2 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 3 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 4 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 5 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 6 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 7 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 8 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 9 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 10 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 11 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 12 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 13 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 14 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 15 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 16 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 17 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 18 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 19 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 20 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 21 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 22 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 23 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 24 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 25 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 26 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 27 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 28 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 29 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 30 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 31 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 32 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 33 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 34 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 35 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 36 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 37 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 38 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 39 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 40 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 41 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 42 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 43 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 44 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 45 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 46 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 47 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 48 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 49 ;

UPDATE employee SET pswd = '$2a$10$HsjHlIRhfh1.uopCQaARsOzlwsquffmzXxNkpuUb0kCbs9xkQ5IYW' WHERE employee_id = 50 ;


INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values ('2023-01-01',1,5);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values ('2023-01-01',2,5);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values ('2023-01-01',3,4);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values ('2023-01-01',4,1);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values ('2023-01-01',5,1);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values ('2023-01-01',6,7);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values ('2023-01-01',7,1);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values ('2023-01-01',8,5);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values ('2023-01-01',9,1);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values ('2023-01-01',10,6);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,11,1);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values ('2025-01-01',12,3);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,13,1);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,14,1);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,15,1);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,16,1);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,17,1);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,18,1);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,19,1);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,20,1);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,21,1);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values ('2024-01-01',22,5);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,23,1);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,24,8);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values ('2024-01-01',25,4);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,26,2);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,27,1);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values ('2025-01-01',28,3);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,29,1);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,30,4);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,31,2);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,32,2);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values ('2023-01-01',33,4);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,34,6);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values ('2023-01-01',35,4);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values ('2023-01-01',36,4);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,37,2);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,38,2);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,39,1);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,40,2);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,41,9);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,42,9);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values ('2023-01-01',43,9);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,44,9);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values ('2023-01-01',45,9);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,46,1);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,47,1);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,48,1);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,49,1);
INSERT INTO employee_has_contract (contract_expiration,employee_id,job_id) values (NULL,50,7);

INSERT INTO address (city,street,street_number,zip_code) values ('Nechanice','Na Kope�ku', 1544, 50315);
INSERT INTO address (city,street,street_number,zip_code) values ('Louny','Louny',17123,44001);
INSERT INTO address (city,street,street_number,zip_code) values ('�hretice','Jir�skova',1045,53832);
INSERT INTO address (city,street,street_number,zip_code) values ('Zajecov','K Luk�rn�',5188,26736);
INSERT INTO address (city,street,street_number,zip_code) values ('Ro�mit�l pod Trem��nem', 'U medv�dk�',2155,26242);


INSERT INTO car_has_workers (car_id,employee_id,deadline) values(1,12,'2022-10-05');
INSERT INTO car_has_workers (car_id,employee_id,deadline) values(1,14,'2022-10-7');
INSERT INTO car_has_workers (car_id,employee_id,deadline) values(1,44,'2022-10-12');
INSERT INTO car_has_workers (car_id,employee_id,deadline) values(3,1,'2022-4-22');
INSERT INTO car_has_workers (car_id,employee_id,deadline) values(3,15,'2022-4-27');

INSERT INTO car_in_building (car_id,building_id,parts) values(1,1,'Volant');
INSERT INTO car_in_building (car_id,building_id,parts) values(1,6,'Motor');
INSERT INTO car_in_building (car_id,building_id,parts) values(2,1,'Zrc�tka');
INSERT INTO car_in_building (car_id,building_id,parts) values(2,6,'Motor');
INSERT INTO car_in_building (car_id,building_id,parts) values(4,1,'Sedadla');
INSERT INTO car_in_building (car_id,building_id,parts) values(4,6,'Motor');

INSERT INTO employee_has_address (address_id, employee_id, address_type) values (1,1,'Koresponden�n� adresa');
INSERT INTO employee_has_address (address_id, employee_id, address_type) values (3,1,'Adresa trval�ho bydli�t�');
INSERT INTO employee_has_address (address_id, employee_id, address_type) values (4,2,'Koresponden�n� adresa');
INSERT INTO employee_has_address (address_id, employee_id, address_type) values (2,3,'Koresponden�n� adresa');
INSERT INTO employee_has_address (address_id, employee_id, address_type) values (5,3,'Adresa trval�ho bydli�t�');

INSERT INTO manager_has_address (manager_id, address_id, address_type) values (1,1,'Adresa trval�ho bydli�t�');
INSERT INTO manager_has_address (manager_id, address_id, address_type) values (5,1,'Adresa trval�ho bydli�t�');    
INSERT INTO manager_has_address (manager_id, address_id, address_type) values (4,4,'Koresponden�n� adresa');    
INSERT INTO manager_has_address (manager_id, address_id, address_type) values (2,3,'Koresponden�n� adresa');    
INSERT INTO manager_has_address (manager_id, address_id, address_type) values (3,5,'Adresa trval�ho bydli�t�');
  