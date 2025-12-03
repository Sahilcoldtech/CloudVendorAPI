package com.thinkconstructive.rest_demo.controller;

import com.thinkconstructive.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {

    private Map<String, CloudVendor> vendorStore = new HashMap<>();

    @GetMapping("/{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable String vendorId) {
        return vendorStore.get(vendorId);
    }

    @GetMapping
    public Collection<CloudVendor> getAllCloudVendors() {
        return vendorStore.values();
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        vendorStore.put(cloudVendor.getVendorId(), cloudVendor);
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        vendorStore.put(cloudVendor.getVendorId(), cloudVendor);
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("/{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable String vendorId) {
        vendorStore.remove(vendorId);
        return "Cloud Vendor Deleted Successfully";
    }
}
